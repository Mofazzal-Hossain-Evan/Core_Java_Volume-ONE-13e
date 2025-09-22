package inventory;

/**
 * Inventory Item Duplicator (Inspired by Jakarta EE E-Commerce)
 */
public class InventoryApp {
    public static void main(String[] args) {
        // আসল Item তৈরি
        Item original = new Item("Gizmo of Infinite Loops", 199.99);
        original.addAttribute("Color", "Black");
        original.addAttribute("Glitch Resistance", "High");

        // clone তৈরি
        Item clone = original.clone();

        // clone পরিবর্তন করি (independent হওয়া উচিত)
        clone.setPrice(149.99);
        clone.addAttribute("Limited Edition", "Yes");

        // দুইটা object প্রিন্ট করি
        System.out.println("Original Item: " + original);
        System.out.println("Cloned Item:   " + clone);

        System.out.println("\n--- Inventory Simulation ---");
        // ছোট inventory array বানাই
        Item[] inventory = new Item[2];
        inventory[0] = original;
        inventory[1] = clone;

        for (Item item : inventory) {
            System.out.println(item);
        }
    }
}
