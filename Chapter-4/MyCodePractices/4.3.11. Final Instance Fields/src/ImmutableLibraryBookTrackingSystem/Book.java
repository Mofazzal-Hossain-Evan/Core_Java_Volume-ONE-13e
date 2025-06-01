package ImmutableLibraryBookTrackingSystem;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final String ISBN;
    private final List<String> borrowHistory;

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
        this.borrowHistory = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public List<String> getBorrowHistory() {
        return new ArrayList<>(borrowHistory); // Protecting the original list
    }

    public void borrowBook(String borrowerName){
        borrowHistory.add(borrowerName + " borrowed on " + java.time.LocalDate.now());
    }

    @Override

    public String toString(){
        return "Book{title='" + title + "', ISBN='" + ISBN + "', Borrow History=" + borrowHistory + "}";

    }
}
