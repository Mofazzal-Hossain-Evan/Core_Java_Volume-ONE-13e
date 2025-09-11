/* Package declaration to match directory structure */
package Inventory_REST_API_Simulator; // Defines the package for organization, matching the directory structure

import java.util.Comparator; // Imports the Comparator interface for custom sorting

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that Comparator implementations like PriceComparator allow ascending sorting, adhering to all rules (e.g., transitivity) to avoid Timsort exceptions in API simulations (Horstmann, p. 258). *Effective Java* (Item 14) stresses consistent comparators (Bloch, p. 70). */

/* Comparator to sort items by price (low to high) */
public class PriceComparator implements Comparator<Item> { // Declares PriceComparator class implementing Comparator for Item objects
    @Override
    public int compare(Item i1, Item i2) {
        // Overrides compare() to define sorting logic
        return Double.compare(i1.getPrice(), i2.getPrice());
        // Compares prices using Double.compare for ascending order
    }
}