package LibraryBookManagementSystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBook(){
        for (Book b : books) {
            b.displayBookInfo();
        }
    }
}
