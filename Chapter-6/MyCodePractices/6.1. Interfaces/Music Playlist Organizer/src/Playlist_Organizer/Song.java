package Playlist_Organizer;

import java.util.Objects;

public class Song implements Comparable<Song>{

    private String title;
    private String artist;
    private int duration;
    private double rating;

    public Song(String title, String artist, int duration, double rating) {

        if (duration <=0) throw  new IllegalArgumentException("Duration must be positive.");
        if (rating < 1.0 || rating > 5.0) throw new IllegalArgumentException("Rating must be between 1.0 and 5.0.");
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Song other){
        int durationCompare = Integer.compare(this.duration, other.duration);
        if (durationCompare == 0){
            return this.title.compareToIgnoreCase(other.title);
        }
        return durationCompare;
    }
    public String toString() {
        return "Title: " + title +
                ", Artist: " + artist +
                ", Duration: " + duration + "s" +
                ", Rating: " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Song)) return false;
        Song song = (Song) obj;
        return title.equalsIgnoreCase(song.title) &&
                artist.equalsIgnoreCase(song.artist);
    }

    public int hashCode(){
        return Objects.hash(title.toLowerCase(), artist.toLowerCase());
    }
}