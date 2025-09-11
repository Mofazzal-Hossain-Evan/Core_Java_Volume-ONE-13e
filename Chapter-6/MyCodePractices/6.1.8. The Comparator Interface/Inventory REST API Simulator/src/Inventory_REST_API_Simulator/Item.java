/* Package declaration to match directory structure */
package Inventory_REST_API_Simulator; // Defines the package for organization, matching the directory structure

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses how classes like Item can be sorted using custom Comparators, enabling flexible ordering for API-like data without implementing Comparable (Horstmann, p. 258). */

/* Class representing an item with name, price, and stockQuantity */
public class Item { // Declares the Item class to model an item with attributes
    private String name; // Private field to store the item's name
    private double price; // Private field to store the item's price
    private int stockQuantity; // Private field to store the item's stock quantity

    /* Constructor */
    public Item(String name, double price, int stockQuantity) { // Constructor to initialize an Item object
        this.name = name; // Assigns the provided name to the name field
        this.price = price; // Assigns the provided price to the price field
        this.stockQuantity = stockQuantity; // Assigns the provided stock quantity to the stockQuantity field
    }

    /* Getters */
    public String getName() { // Getter method to access the name field
        return name; // Returns the name of the item
    }

    public double getPrice() { // Getter method to access the price field
        return price; // Returns the price of the item
    }

    public int getStockQuantity() { // Getter method to access the stockQuantity field
        return stockQuantity; // Returns the stock quantity of the item
    }

    @Override
    public String toString() { // Overrides toString() to provide a string representation of the Item
        return "{\"name\":\"" + name + "\", \"price\":" + price + ", \"stockQuantity\":" + stockQuantity + "}"; // Returns JSON-like string for the item
    }
}