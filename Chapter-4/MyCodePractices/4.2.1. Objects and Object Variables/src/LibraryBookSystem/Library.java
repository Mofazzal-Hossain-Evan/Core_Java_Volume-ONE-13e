package LibraryBookSystem;

import javax.xml.transform.Source;

public class Library {

    Book[] books;
    int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count ++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void showBooks() {
        System.out.println("Library Books");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }

    }
}
