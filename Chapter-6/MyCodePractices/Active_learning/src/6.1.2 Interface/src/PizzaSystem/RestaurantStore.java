package PizzaSystem;

public class RestaurantStore {

    private MenuItem[] menu;

    public RestaurantStore() {
        menu = new MenuItem[]{
                // Pizzas
                new Pizza("Margherita", 8.99, 850, "Classic"),
                new Pizza("Pepperoni", 10.99, 950, "Classic"),
                new Pizza("BBQ Chicken", 12.99, 1100, "Specialty"),
                new Pizza("Veggie Delight", 9.99, 750, "Healthy"),

                // Burgers
                new Burger("Classic Beef", 7.99, 700, "Classic"),
                new Burger("Crispy Chicken", 8.99, 650, "Classic"),
                new Burger("Mushroom Swiss", 9.99, 720, "Specialty"),

                // Drinks
                new Drink("Mango Smoothie", 4.99, 320, "Cold"),
                new Drink("Lemon Iced Tea", 3.99, 180, "Cold"),
                new Drink("Hot Chocolate", 4.49, 410, "Hot"),

                // Grilled Pizzas
                new GrilledPizza("Smoky BBQ", 13.99, 1200, "Specialty"),
                new GrilledPizza("Charcoal Veggie", 11.99, 900, "Healthy")
        };
    }

    public MenuItem[] getMenu() {
        return menu;
    }
}