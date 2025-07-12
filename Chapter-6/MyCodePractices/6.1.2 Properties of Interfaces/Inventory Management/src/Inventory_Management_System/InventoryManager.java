/* Package declaration to match directory structure */
package Inventory_Management_System;

import java.util.List;
import java.util.ArrayList;

/* Main class to manage inventory items, categorize, and duplicate them */
public class InventoryManager {

    /* Method to process and categorize items, duplicating those with specific categories */
    public static void processInventory(List<Categorizable> items) {
        System.out.println("🔍 Processing inventory items:");

        // প্রতিটি আইটেমের জন্য লুপ চালাও
        for (Categorizable item : items) {
            // আইটেম এবং তার ক্যাটেগরি দেখাও
            System.out.println("Item: " + item + ", Category: " + item.getCategory());

            // যদি আইটেমটি Duplicatable হয়, তাহলে...
            if (item instanceof Duplicatable duplicatable) {
                try {
                    // যদি ক্যাটেগরি "Electronics" হয়, তাহলে ডুপ্লিকেট করো
                    if (item.getCategory().equals("Electronics")) {
                        Object duplicatedItem = duplicatable.duplicate();
                        System.out.println("📄 Duplicated: " + duplicatedItem);

                        // যদি ডুপ্লিকেট আইটেমটি Electronics হয়, তাহলে দাম বাড়াও
                        if (duplicatedItem instanceof Electronics electronics) {
                            electronics.setPrice(electronics.getPrice() + 50.0); // ৫০ টাকা বেশি করো
                            System.out.println("🛠️ Modified duplicate: " + duplicatedItem);
                            System.out.println("✅ Original remains unchanged: " + item);
                        }
                    }
                } catch (CloneNotSupportedException e) {
                    // যদি clone support না করে, তাহলে exception ধরো
                    System.out.println("❌ Duplication failed: " + e.getMessage());
                }
            } else {
                System.out.println("ℹ️ Item is not Duplicatable");
            }

            System.out.println(); // ফাঁকা লাইন
        }
    }

    /* Main method to run the inventory management simulation */
    public static void main(String[] args) {
        // ইনভেন্টরি আইটেমের লিস্ট তৈরি করো
        List<Categorizable> items = new ArrayList<>();

        // কিছু স্যাম্পল আইটেম যোগ করো
        items.add(new Book("Java Programming", 29.99, "Books"));
        items.add(new Electronics("Smartphone", 599.99, "Electronics"));
        items.add(new Clothing("T-Shirt", 19.99, "Apparel"));
        items.add(new Book("Data Structures", 39.99, "")); // default category লাগবে

        // প্রোসেসিং মেথড কল করো
        processInventory(items);
    }
}
