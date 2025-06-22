package Dynamic_Library;

public abstract class FictionBook implements Book{

    private String title, author;
    private boolean available;

    public FictionBook(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }



}
