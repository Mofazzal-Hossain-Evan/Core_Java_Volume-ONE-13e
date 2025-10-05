/* Package declaration to match directory structure */
package Inventory_Stock_Checker;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import javax.swing.Timer;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights lambda expressions as concise implementations for Comparators and ActionListeners, simplifying sorting and scheduled tasks in Spring Boot-inspired inventory systems (Horstmann, p. 274). *Effective Java* (Item 42) advocates lambdas for functional interfaces to reduce boilerplate in event-driven applications (Bloch, p. 200). */

/* Main class for inventory stock checker with lambda-based sorting and timer */
public class InventoryStockChecker {
    public static void main(String[] args) {
        /* Create inventory with absurd items */
        InventoryItem[] inventory = {
                new InventoryItem("Enchanted USB Drive", 10, LocalDate.of(2025, 9, 1)),
                new InventoryItem("Quantum Widget", 5, LocalDate.of(2025, 8, 15)),
                new InventoryItem("Gizmo of Infinite Loops", 15, LocalDate.of(2025, 9, 20)),
                new InventoryItem("Pixelated Potion", 3, LocalDate.of(2025, 7, 30))
        };

        /* Sort by stock level (ascending) using lambda Comparator */
        Arrays.sort(inventory, (item1, item2) -> item1.getStockLevel() - item2.getStockLevel());
        System.out.println("Inventory sorted by stock level (lowest first):");
        checkAndPrintInventory(inventory);
        System.out.println();

        /* Sort by last restock date using lambda Comparator */
        Arrays.sort(inventory, (item1, item2) -> item1.getLastRestock().compareTo(item2.getLastRestock()));
        System.out.println("Inventory sorted by last restock date:");
        checkAndPrintInventory(inventory);
        System.out.println();

        /* Simulate stock decrement with Timer and lambda ActionListener */
        Random random = new Random();
        Timer timer = new Timer(3000, event -> {
            if (inventory.length > 0) {
                int index = random.nextInt(inventory.length);
                InventoryItem item = inventory[index];
                int decrement = random.nextInt(3) + 1; // Decrease by 1-3
                item.setStockLevel(Math.max(0, item.getStockLevel() - decrement));
                System.out.println("Stock updated: " + item.getName() + " reduced by " + decrement + " units");
                checkAndPrintInventory(inventory);
            }
        });
        timer.start();

        /* Allow user to stop the timer (simulating user interaction) */
        try {
            Thread.sleep(10000); // Run for 10 seconds to demonstrate
            timer.stop();
            System.out.println("Stock checker paused. Exiting the cosmic warehouse!");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /* Helper method to print inventory and alert for low stock */
    private static void checkAndPrintInventory(InventoryItem[] inventory) {
        for (InventoryItem item : inventory) {
            System.out.println(item);
            if (item.getStockLevel() <= 5) {
                System.out.println("  ALERT: Low stock for " + item.getName() + "! Only " + item.getStockLevel() + " left!");
            }
        }
    }
}