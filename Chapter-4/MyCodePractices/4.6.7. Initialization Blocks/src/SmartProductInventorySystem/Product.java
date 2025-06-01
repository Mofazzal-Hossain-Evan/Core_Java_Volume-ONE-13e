package SmartProductInventorySystem;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private static List<Product> inventory = new ArrayList<>();
    private static int nextId = 1000;

    private int id;
    private String name;
    private int quantity;

    // Static block to pre-fill inventory
    static {
        inventory.add(new Product("Laptop", 3));
        inventory.add(new Product("Phone", 10));
    }

    // Constructor
    public Product(String name, int quantity) {
        this.id = nextId++; // Assign unique ID
        this.name = name;
        this.quantity = quantity;

        // Object Initialization Block
        {
            inventory.add(this);
        }
    }

    public static void displayInventory() {
        for (Product p : inventory) {
            System.out.println("Product [ID=" + p.id + ", Name=" + p.name + ", Quantity=" + p.quantity + "]");
        }
    }
}
