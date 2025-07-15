package LibrarySystem;

/*
 * Book: a LibraryItem that is both Borrowable and Searchable.
 * Demonstrates abstract class + multiple interfaces.
 */
public class Book extends LibraryItem implements Borrowable, Searchable {

    private String author;

    public Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Book: " + title + " by " + author;
    }

    @Override
    public void borrow() {
        System.out.println(title + " has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " has been returned.");
    }

    @Override
    public boolean searchByTitle(String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }
}
