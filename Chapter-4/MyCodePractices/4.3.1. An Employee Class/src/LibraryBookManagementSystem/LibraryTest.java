package LibraryBookManagementSystem;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Programming", "John Doe", "12345");
        Book b2 = new Book("Python Essentials", "Jane Smith", "67890");

        library.addBook(b1);
        library.addBook(b2);

        library.displayBook();
        b1.borrowBook();
        library.displayBook();
        b1.returnBook();
        library.displayBook();
    }
}
