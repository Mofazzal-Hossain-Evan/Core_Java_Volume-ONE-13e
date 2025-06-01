package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryBook {

    private static List<LibraryBook> books = new ArrayList<>();
    private static int nextId = 100;

    private int id;
    private String title;

    static {
        books.add(new LibraryBook("Java book"));
    }

    {
        id = nextId++;
        books.add(this);
    }

    public LibraryBook(String title) {
        this.title = title;
    }

    public static void displayBooks(){
        for (LibraryBook b : books) {
            System.out.println("Book [ID=" + b.id + ", Title=" + b.title + "]");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n🔹 Library Test");
        LibraryBook.displayBooks();
    }
}
