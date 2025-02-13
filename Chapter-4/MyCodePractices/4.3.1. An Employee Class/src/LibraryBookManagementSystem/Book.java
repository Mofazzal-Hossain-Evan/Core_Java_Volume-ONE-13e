package LibraryBookManagementSystem;

public class Book {
private String title;
private String ISBN;
private String author;
private boolean isAvailable;

public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.isAvailable = true;
}
public void borrowBook() {
    if (isAvailable) {
        isAvailable = false;
        System.out.println(title + " has been borrowed.");
    } else {
        System.out.println(title + " is currently unavailable.");
    }
}
    public void returnBook(){
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void displayBookInfo(){
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + isAvailable);

    }

}
