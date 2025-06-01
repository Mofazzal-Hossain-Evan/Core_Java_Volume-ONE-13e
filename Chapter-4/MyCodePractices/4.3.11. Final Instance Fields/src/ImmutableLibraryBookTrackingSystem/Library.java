package ImmutableLibraryBookTrackingSystem;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "978-0135166307");
        book.borrowBook("Evan");
        book.borrowBook("Alice");

        System.out.println(book);
    }
}
