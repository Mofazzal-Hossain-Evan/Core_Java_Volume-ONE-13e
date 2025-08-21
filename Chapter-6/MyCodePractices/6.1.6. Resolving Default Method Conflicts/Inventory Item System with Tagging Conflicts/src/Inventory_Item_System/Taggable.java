/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) describes how interfaces can provide default methods, but conflicts arise when multiple interfaces define the same default method, requiring resolution in the implementing class (Horstmann, p. 261). */

/* Interface Taggable with default getTag and toString */
public interface Taggable {
    default String getTag() {
        return "Tagged";
    }


    // Default toString(); note: won't override Object's toString() automatically due to "class wins" rule
}
