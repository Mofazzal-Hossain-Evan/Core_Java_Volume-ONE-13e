/* Package declaration to match directory structure */
package Inventory_Management_System;

/* Book class implementing Categorizable and Duplicatable interfaces */
public final class Book implements Categorizable, Duplicatable {
    /* Instance variables for book details */
    private String title; // Book title
    private double price; // Book price
    private String category; // Book category

    /* Constructor to initialize book details */
    public Book(String title, double price, String category) {
        this.title = title; // Set book title
        this.price = price; // Set book price
        this.category = (category != null && !category.isEmpty()) ? category : DEFAULT_CATEGORY; // Set category or default
    }

    /* Implements getCategory method from Categorizable interface */
    @Override
    public String getCategory() {
        return category; // Return book category
    }

    /* Implements duplicate method from Duplicatable interface */
    @Override
    public Object duplicate() throws CloneNotSupportedException {
        /* Create a new Book with the same attributes */
        return new Book(this.title, this.price, this.category); // Return duplicated book
    }

    /* Getter for title */
    public String getTitle() {
        return title; // Return book title
    }

    /* Getter for price */
    public double getPrice() {
        return price; // Return book price
    }

    /* Setter for price */
    public void setPrice(double price) {
        this.price = price; // Update book price
    }

    /* Override toString for readable output */
    @Override
    public String toString() {
        return "Book{title='" + title + "', price=" + price + ", category='" + category + "'}";
    }
}