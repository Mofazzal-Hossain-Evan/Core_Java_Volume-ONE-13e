package LibraryBookSystem;

public class LibrarySystem {
    public static void main(String[] args) {
Library lib = new Library(6);

Book b1 = new Book("Java Programming", "James Gosling", 1995);
Book b2 = new Book("Clean Code", "Robert C. Martin", 2008);

lib.addBook(b1);
lib.addBook(b2);

lib.showBooks();
    }
}
