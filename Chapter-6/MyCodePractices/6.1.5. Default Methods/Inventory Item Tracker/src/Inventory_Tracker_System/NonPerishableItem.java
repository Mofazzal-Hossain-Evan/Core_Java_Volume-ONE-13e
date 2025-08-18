/* Package declaration to match directory structure */
package Inventory_Tracker_System;

/* Theory: *Effective Java* (Item 20) suggests overriding default methods in implementations like NonPerishableItem when specialized behavior is needed, such as supporting restocking, while using other defaults (Bloch, p. 109). */

/* Non-perishable item implementation */
public class NonPerishableItem implements InventoryItem {
    private String name;
    private int quantity;

    public NonPerishableItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public boolean isLowStock(){
        return false;
    }
    public void restock(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("");
        } else {
            this.quantity += amount;
            System.out.println();
        }
    }


    public String getCategory(){
        return "Uncategorized from NonPerishableItem";

    }
}
