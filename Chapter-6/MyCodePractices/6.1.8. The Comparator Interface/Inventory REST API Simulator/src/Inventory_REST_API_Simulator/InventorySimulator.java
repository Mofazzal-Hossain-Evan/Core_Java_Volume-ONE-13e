/* Package declaration to match directory structure */
package Inventory_REST_API_Simulator; // Defines the package for organization, matching the directory structure

import java.util.Arrays; // Imports Arrays for sorting arrays

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes using Arrays.sort with custom Comparators in simulators like InventorySimulator to sort data, printing JSON-like strings to mimic Spring Boot REST responses (Horstmann, p. 258). *Effective Java* (Item 14) recommends Comparators for API data ordering (Bloch, p. 70). */

/* Main class for inventory simulation and sorting */
public class InventorySimulator { // Declares the main InventorySimulator class
    public static void main(String[] args) { // Main method to run the inventory simulator
        /* Create items with quirky names */
        Item[] items = new Item[4]; // Initializes an array to hold 4 items
        items[0] = new Item("Magic Code Wand", 19.99, 50); // Creates a quirky Item with name "Magic Code Wand", price 19.99, stock 50
        items[1] = new Item("Infinite Coffee Mug", 9.99, 100); // Creates a quirky Item with name "Infinite Coffee Mug", price 9.99, stock 100
        items[2] = new Item("Bug Repellent Spray", 14.99, 75); // Creates an Item with name "Bug Repellent Spray", price 14.99, stock 75
        items[3] = new Item("Time Travel Watch", 99.99, 10); // Creates a quirky Item with name "Time Travel Watch", price 99.99, stock 10

        System.out.println("Original Inventory:"); // Prints header for original inventory list
        System.out.println(Arrays.toString(items)); // Prints the items array as a string (JSON-like)
        System.out.println(); // Prints a blank line for readability

        /* Sort by price (low to high) */
        Arrays.sort(items, new PriceComparator()); // Sorts the items array using PriceComparator
        System.out.println("REST Response: Inventory Sorted by Price"); // Prints header simulating REST API response for price sort
        System.out.print("["); // Starts the JSON-like array
        for (int i = 0; i < items.length; i++) { // Iterates through the sorted items array
            System.out.print(items[i]); // Prints each item's toString() (JSON-like object)
            if (i < items.length - 1) System.out.print(", "); // Adds comma separator if not the last item
        }
        System.out.println("]"); // Ends the JSON-like array
        System.out.println(); // Prints a blank line for readability

        /* Sort by stock quantity (highest first) */
        Arrays.sort(items, new StockComparator()); // Sorts the items array using StockComparator
        System.out.println("REST Response: Inventory Sorted by Stock"); // Prints header simulating REST API response for stock sort
        System.out.print("["); // Starts the JSON-like array
        for (int i = 0; i < items.length; i++) { // Iterates through the sorted items array
            System.out.print(items[i]); // Prints each item's toString() (JSON-like object)
            if (i < items.length - 1) System.out.print(", "); // Adds comma separator if not the last item
        }
        System.out.println("]"); // Ends the JSON-like array
    }
}