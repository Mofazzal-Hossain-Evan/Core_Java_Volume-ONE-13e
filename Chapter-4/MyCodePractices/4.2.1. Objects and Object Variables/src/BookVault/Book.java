package BookVault;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Book {

    private String title;
    private String author;
    private Date addedDate;

    public Book(String title, String author, Date addedDate) {
        this.title = title;
        this.author = author;
        this.addedDate = new Date();
    }
   public String getTitle() {
        return title;
   }

   public String getAuthor(){
        return author;
   }
   public Date getAddeddDate() {
        return addedDate;
   }
@Override
   public String toString(){
        return "Title: " + title + ", Author: " + author + ", Added: " + addedDate;
   }

}
