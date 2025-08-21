/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) emphasizes resolving interface conflicts through overrides and the "class wins" rule for superclass methods (Horstmann, p. 261). For Object methods like toString(), interface defaults are ignored in favor of Object's implementation unless explicitly overridden to call the default. *Effective Java* (Item 20) warns about careful use of defaults, especially with Object methods (Bloch, p. 109). */

/* Class containing main method for testing product classes */
public class InventoryItemSystem {
    public static void main(String[] args) {
        /* Test ProductWithConflict: override resolves conflict */
        ProductWithConflict productConflict = new ProductWithConflict();
        System.out.println("ProductWithConflict getTag(): " + productConflict.getTag());
        System.out.println("ProductWithConflict toString(): " + productConflict); // Uses Object's toString(), not Taggable's default
        System.out.println();

        /* Test ProductWithSuperclass: superclass wins, no conflict */
        ProductWithSuperclass productSuper = new ProductWithSuperclass();
        System.out.println("ProductWithSuperclass getTag(): " + productSuper.getTag());
        System.out.println("ProductWithSuperclass toString(): " + productSuper); // Uses Object's toString()
        System.out.println();

        /* Demonstrate limitation with default toString(): Not used automatically due to Object precedence */
        // To use Taggable's toString(), need explicit override, e.g.:
        // @Override
        // public String toString() {
        //     return Taggable.super.toString();
        // }
        // If added to ProductWithConflict, it would use Taggable's default toString()

        /* Note: If another interface (e.g., Categorizable) had default toString(), it would cause conflict requiring override. This illustrates the practical restriction when dealing with Object methods in multiple interfaces. */
    }
}