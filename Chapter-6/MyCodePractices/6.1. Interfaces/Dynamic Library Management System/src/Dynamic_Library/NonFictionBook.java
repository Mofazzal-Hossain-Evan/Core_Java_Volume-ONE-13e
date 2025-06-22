package Dynamic_Library;

public class NonFictionBook implements Book{

    private String title, author;
    private boolean available;

    public NonFictionBook(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = true;
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

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getStatus(){
        return "NON-Fiction: " + title + (available ? "(Available)" : " (Borrowed)");

    }

    public int compareTo(Book other){
        return this.title.compareTo(other.getTitle());
    }
}
