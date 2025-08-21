/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) explains that concrete methods in superclasses take precedence over default methods in interfaces, following the "class wins" rule (Horstmann, p. 261). */

/* Superclass ItemBase with concrete getTag */
public class ItemBase {
    public String getTag() {
        return "From ItemBase";
    }
}