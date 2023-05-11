import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main (String[]args) throws IOException {
            write("English","Bukvy");
            System.out.println(read());
        }
        public static void write (String title, String author)throws IOException {
            FileWriter fileWriter = new FileWriter("Song.txt");
            fileWriter.write(title + "\n");
            fileWriter.write(author + "\n");
            fileWriter.write(
                    "1. A a"+ "\n"+
                    "2. B b"+"\n"+
                    "3. C c"+"\n"+
                    "4. D d"+"\n"+
                    "5. E e"+"\n"+
                    "6. F f"+"\n"+
                    "7. G g"+"\n"+
                    "8. H h"+"\n"+
                    "9. I i"+"\n"+
                    "10. J j"+"\n"+
                    "11. K k"+"\n"+
                    "12. L l"+"\n"+
                    "13. M m"+"\n"+
                    "14. N n"+"\n"+
                    "15. O o"+"\n"+
                    "16. P p"+"\n"+
                    "17. Q q"+"\n"+
                    "18. R r"+"\n"+
                    "19. S s"+"\n"+
                    "20. T t"+"\n"+
                    "21. U u"+"\n"+
                    "22. V v"+"\n"+
                    "23. W w"+"\n"+
                    "24. X x"+"\n"+
                    "25. Y y"+"\n"+
                    "26. Z z" +"\n"+
                    "27. 0" +"\n"+
                    "28.  1 " +"\n"+
                    "29.  2 " +"\n"+
                    "30.  3 " +"\n"+
                    "31.  4 " +"\n"+
                    "32.  5 " +"\n"+
                    "33.  6 " +"\n"+
                    "34.  7 " +"\n"+
                    "35.  8 " +"\n"+
                    "36. 9 " );
            fileWriter.close();
        }
        public static Song read () throws IOException {
            FileReader fileReader = new FileReader("Song.txt");
            Scanner scanner = new Scanner(fileReader);
            Song song = new Song();
            StringBuilder stringBuilder = new StringBuilder();
            song.setBukvy(song.getBukvy());
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            song.setBukvy(stringBuilder.toString());
            fileReader.close();
            return song;
        }
    }
