package DigitalLibrary;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private  int edition;
    private  int year;
  //  private  int isbn;

    public Book(String title, String author, int edition, int year) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    public int getYear() {
        return year;
    }



    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;

        Book other = (Book) otherObject;
        return Objects.equals(title, other.title) && Objects.equals(author, other.author);

    }
}
