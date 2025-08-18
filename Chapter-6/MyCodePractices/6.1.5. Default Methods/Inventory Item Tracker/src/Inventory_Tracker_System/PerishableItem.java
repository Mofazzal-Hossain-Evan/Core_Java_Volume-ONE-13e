package Inventory_Tracker_System;

public class PerishableItem implements InventoryItem {

private String name;
private int quantity;

    public PerishableItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return 0;
    }

    @Override
    public boolean isLowStock() {
        return InventoryItem.super.isLowStock();
    }

    @Override
    public void restock(int amount) {
        InventoryItem.super.restock(amount);
    }

    @Override
    public String getCategory() {
        return InventoryItem.super.getCategory();
    }
}
