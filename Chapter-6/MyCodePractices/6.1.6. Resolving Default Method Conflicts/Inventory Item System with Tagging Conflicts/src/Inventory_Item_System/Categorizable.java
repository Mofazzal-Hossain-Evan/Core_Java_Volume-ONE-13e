/* Package declaration to match directory structure */
package Inventory_Item_System;

/* Theory: *Effective Java* (Item 21) discusses the importance of designing interfaces carefully to avoid conflicts in default methods when multiple interfaces are implemented (Bloch, p. 112). */

/* Interface Categorizable with default getTag */
public interface Categorizable {
    default String getTag() {
        return "Categorized";
    }
}