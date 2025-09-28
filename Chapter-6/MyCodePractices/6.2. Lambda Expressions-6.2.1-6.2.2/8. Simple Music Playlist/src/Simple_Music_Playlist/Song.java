package Simple_Music_Playlist;

public class Song {
    private String title;
    private int duration;
    private double rating;

    public Song(String title, int duration, double rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }
}
