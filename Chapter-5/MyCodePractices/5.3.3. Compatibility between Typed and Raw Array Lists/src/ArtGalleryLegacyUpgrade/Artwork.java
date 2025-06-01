package ArtGalleryLegacyUpgrade;

 class Artwork {
    private String title, artist;
    private int year;

    public Artwork(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    // এটি LegacyArtwork থেকে কনভার্ট করার জন্য একটি কনস্ট্রাক্টর

    public Artwork(LegacyArtwork legacy) {
        this.title = legacy.getTitle();
        this.artist = legacy.getArtist();
        this.year = legacy.getYear();
    }


    @Override
    public String toString() {
        return " \uD83D\uDD8C\uFE0F Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
