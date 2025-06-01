package ClassicMovieDatabaseModernizer;

public class Movie {

    private String title;
    private String director;
    private int releaseYear;

    public Movie(LegacyMovie legacy){
        this.title = legacy.getTitle();
        this.director = legacy.getDirector();
        this.releaseYear = legacy.getReleaseYear();
    }

    @Override
    public String toString() {
        return "\uD83C\uDFAC Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
