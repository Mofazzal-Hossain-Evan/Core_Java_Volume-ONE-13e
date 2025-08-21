/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) notes that when implementing multiple interfaces with conflicting default methods, the class must override the method to resolve the conflict, potentially using super to invoke a specific default (Horstmann, p. 261). */

/* Product class implementing both interfaces, resolving conflict by overriding */
public class ProductWithConflict implements Taggable, Categorizable {
    @Override
    public String getTag() {
        return Taggable.super.getTag(); // Resolves by selecting Taggable's default
    }

    public String toString() {
        return "Taggable: " + getTag();
    }
}