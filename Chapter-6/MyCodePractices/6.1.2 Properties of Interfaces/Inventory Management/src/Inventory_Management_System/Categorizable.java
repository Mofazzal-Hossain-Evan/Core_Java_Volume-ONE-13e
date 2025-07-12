package Inventory_Management_System;

public sealed interface Categorizable permits Book, Electronics, Clothing{
    String DEFAULT_CATEGORY = "Uncategorized";

    String getCategory();

}