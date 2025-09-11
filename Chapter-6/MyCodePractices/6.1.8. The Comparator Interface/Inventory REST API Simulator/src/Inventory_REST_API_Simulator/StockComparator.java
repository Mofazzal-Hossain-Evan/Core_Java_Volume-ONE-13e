/* Package declaration to match directory structure */
package Inventory_REST_API_Simulator; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that Comparators like StockComparator can implement descending order, ensuring all rules for reliable sorting in REST API-like responses (Horstmann, p. 258). */

/* Comparator to sort items by stock quantity (highest first) */
public class StockComparator implements Comparator<Item> { // Declares StockComparator class implementing Comparator for Item objects
    @Override
    public int compare(Item i1, Item i2) { // Overrides compare() to define sorting logic
        return Integer.compare(i2.getStockQuantity(), i1.getStockQuantity()); // Compares stock quantities in descending order (highest first)
    }
}