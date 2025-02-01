package LibraryBookSystem;

import javax.xml.transform.Source;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.println(title + " by " + author + " (" + year + ")");
    }
}
