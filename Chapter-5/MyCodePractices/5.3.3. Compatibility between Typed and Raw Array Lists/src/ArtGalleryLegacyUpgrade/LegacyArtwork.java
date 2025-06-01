package ArtGalleryLegacyUpgrade;

public class LegacyArtwork {
    private String title, artist;
    private int year;

    public LegacyArtwork(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "LegacyArtwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
