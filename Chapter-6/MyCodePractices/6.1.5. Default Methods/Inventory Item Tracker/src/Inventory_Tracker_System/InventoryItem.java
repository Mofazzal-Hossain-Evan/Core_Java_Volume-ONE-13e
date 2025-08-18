/* Package declaration to match directory structure */
package Inventory_Tracker_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that default methods in interfaces like InventoryItem provide fallback implementations and support interface evolution without breaking existing classes (Horstmann, p. 262). *Effective Java* (Item 20) recommends using default methods for optional operations and to maintain backward compatibility (Bloch, p. 109). */

/* Interface for inventory items with default methods */
public interface InventoryItem {
    /* Abstract method to get quantity */
    int getQuantity();

    /* Default method to check if stock is low */
    default boolean isLowStock() {
        return getQuantity() < 10;
    }

    /* Default method for restock that throws exception */
    default void restock(int amount) {
        throw new UnsupportedOperationException("Restocking not supported");
    }

    /* New default method for getting category to simulate interface evolution */
    default String getCategory() {
        return "Uncategorized";
    }
}