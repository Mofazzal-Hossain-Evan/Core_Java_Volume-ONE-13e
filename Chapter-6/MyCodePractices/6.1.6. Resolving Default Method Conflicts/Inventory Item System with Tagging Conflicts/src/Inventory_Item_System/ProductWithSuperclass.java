/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) highlights that the "class wins" rule means superclass methods override interface defaults, preventing conflicts even if interfaces have conflicting defaults (Horstmann, p. 261). */

/* Product class extending ItemBase and implementing both interfaces, no override needed */
public class ProductWithSuperclass extends ItemBase implements Taggable, Categorizable {
    // No override; uses superclass getTag()
    public String getTag() {
        return Taggable.super.getTag();
    }
}