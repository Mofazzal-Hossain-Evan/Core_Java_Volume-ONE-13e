/* Package declaration to match directory structure */
package Inventory_Tracker_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes that default methods support interface evolution, such as adding getCategory(), without requiring updates to existing implementations like PerishableItem, ensuring backward compatibility (Horstmann, p. 262). *Effective Java* (Item 20) highlights defaults for convenience and optional operations (Bloch, p. 109). */

/* Class containing main method for testing InventoryItem implementations */
public class InventoryTrackerSystem {
    public static void main(String[] args) {
        /* Create PerishableItem instance */
        InventoryItem milk = new PerishableItem("Milk", 5);
        System.out.println("Testing PerishableItem (uses default methods except getQuantity):");
        System.out.println("Milk quantity: " + milk.getQuantity());
        System.out.println("Is low stock? " + milk.isLowStock()); // Uses default isLowStock()
        try {
            milk.restock(10); // Uses default restock(), expects exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Restock failed as expected: " + e.getMessage());
        }
        System.out.println("Category: " + milk.getCategory()); // Uses default getCategory()
        System.out.println();

        /* Create NonPerishableItem instance */
        InventoryItem cans = new NonPerishableItem("Canned Beans", 3);
        System.out.println("Testing NonPerishableItem (overrides restock, uses defaults for others):");
        System.out.println("Canned Beans quantity: " + cans.getQuantity());
        System.out.println("Is low stock? " + cans.isLowStock()); // Uses default isLowStock()
        cans.restock(20); // Uses overridden restock()
        System.out.println("Canned Beans quantity after restock: " + cans.getQuantity());
        System.out.println("Category: " + cans.getCategory()); // Uses default getCategory()
        System.out.println();

        /* Demonstrate interface evolution: getCategory() added as default, compatible with both implementations */
        System.out.println("Demonstrating interface evolution with getCategory():");
        System.out.println("PerishableItem category (default): " + milk.getCategory());
        System.out.println("NonPerishableItem category (default): " + cans.getCategory());
    }
}