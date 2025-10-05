/* Package declaration to match directory structure */
package Inventory_Stock_Checker;

import java.time.LocalDate;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that classes like InventoryItem can be sorted using lambda-based Comparators, leveraging functional interfaces for flexible sorting in inventory management systems (Horstmann, p. 274). *Effective Java* (Item 42) recommends lambdas for functional interfaces like Comparator to enhance code readability and conciseness (Bloch, p. 200). */

/* InventoryItem class with basic fields */
public class InventoryItem {
    private String name;
    private int stockLevel;
    private LocalDate lastRestock;

    public InventoryItem(String name, int stockLevel, LocalDate lastRestock) {
        this.name = name;
        this.stockLevel = stockLevel;
        this.lastRestock = lastRestock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public LocalDate getLastRestock() {
        return lastRestock;
    }

    @Override
    public String toString() {
        return "InventoryItem{name='" + name + "', stockLevel=" + stockLevel + ", lastRestock=" + lastRestock + "}";
    }
}