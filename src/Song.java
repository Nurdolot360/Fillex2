public class Song {
    private String bukvy;

    public Song() {
    }

    public Song(String bukvy) {
        this.bukvy = bukvy;
    }

    public String getBukvy() {
        return bukvy;
    }

    public void setBukvy(String bukvy) {
        this.bukvy = bukvy;
    }

    @Override
    public String toString() {
        return
                "bukvy='" + bukvy +"\n";
    }
}