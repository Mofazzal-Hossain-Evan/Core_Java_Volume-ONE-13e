package PizzaSystem;

public sealed interface MenuBehavior
        permits Orderable, MenuItem {   // Important: both must be permitted

    String getCategory();
}