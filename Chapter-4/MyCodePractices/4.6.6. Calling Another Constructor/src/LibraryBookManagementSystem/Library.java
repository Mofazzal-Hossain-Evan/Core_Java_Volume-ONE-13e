package LibraryBookManagementSystem;

public class Library {
    public static void main(String[] args) {


    Book b1 = new Book("Java Programming");
    Book b2 = new Book("Effective Java", "Joshua Bloch");
    b1.displayBook();
    b2.displayBook();
    }

}
