package Dynamic_Library;

public interface Book {
    String getTitle();
    String getAuthor();
    boolean isAvailable();

    void setAvailable(boolean available);
    String getStatus();

}
