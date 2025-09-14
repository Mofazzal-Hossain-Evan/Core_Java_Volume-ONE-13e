/* Package declaration to match directory structure */
package Inventory_Item_Duplicator;

import java.util.HashMap;
import java.util.Map;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes deep cloning for mutable maps to maintain independence, akin to product duplication in Jakarta EE e-commerce without affecting original entities (Horstmann, p. 271). */

/* Class containing main method for testing Item cloning */
public class InventoryItemDuplicator {
    public static void main(String[] args) throws CloneNotSupportedException {
        /* Create original item */
        Map<String, String> attributes = new HashMap<>();
        attributes.put("Glitch Resistance", "High");
        attributes.put("Loop Capacity", "Infinite");
        Item original = new Item("Gizmo of Infinite Loops", 49.99, attributes);

        /* Clone the item */
        Item clone = original.clone();

        /* Modify the clone */
        clone.setPrice(59.99);
        clone.getAttributes().put("Color", "Neon Green");

        /* Print both to verify independence */
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
        System.out.println();

        /* Mimic JEE entity management with an inventory array */
        Item[] inventory = new Item[2];
        inventory[0] = original;
        inventory[1] = new Item("Widget of Weird Errors", 29.99, new HashMap<>() {{
            put("Error Type", "Syntax");
            put("Fix Time", "Instant");
        }});

        /* Clone selected items for a new catalog */
        Item[] newCatalog = new Item[inventory.length];
        for (int i = 0; i < inventory.length; i++) {
            newCatalog[i] = inventory[i].clone();
        }

        /* Update clones for the new catalog */
        newCatalog[0].setPrice(69.99);
        newCatalog[0].getAttributes().put("Edition", "Limited");
        newCatalog[1].getAttributes().put("Color", "Red");

        /* Print original inventory and new catalog */
        System.out.println("Original Inventory:");
        for (Item item : inventory) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("New Catalog (Clones):");
        for (Item item : newCatalog) {
            System.out.println(item);
        }
    }
}