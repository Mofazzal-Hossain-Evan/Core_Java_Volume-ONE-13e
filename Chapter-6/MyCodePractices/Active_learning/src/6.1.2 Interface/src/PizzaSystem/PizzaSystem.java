package PizzaSystem;

public class PizzaSystem {

    public static void main(String[] args) {
        RestaurantStore store = new RestaurantStore();
        MenuItem[] menu = store.getMenu();

        System.out.println("=== 1. Interface Variable ===");
        Orderable o = new Pizza("Margherita", 8.99, 850, "Classic");
        o.prepare("Chef Rahim");

        System.out.println("\n=== 2. instanceof Check ===");
        for (MenuItem item : menu) {
            if (item instanceof Bakeable) {
                System.out.println(item.getName() + " is Bakeable ✔");
            }
            if (item instanceof Grillable) {
                System.out.println(item.getName() + " is Grillable ✔");
            }
        }

        System.out.println("\n=== 3. Interface Polymorphism ===");
        Orderable o2 = new Burger("Classic Beef", 7.99, 700, "Classic");
        o2.prepare("Chef Karim");
        o2.serve(5);

        System.out.println("\n=== 4. Constant Check ===");
        int temp = 550;
        if (temp > Bakeable.MAX_TEMP) {
            System.out.println("Warning: " + temp + "°C exceeds MAX_TEMP!");
        }

        System.out.println("\n=== 5. Multiple Implements ===");
        GrilledPizza gp = new GrilledPizza("Smoky BBQ", 13.99, 1200, "Specialty");
        gp.bake(400);
        gp.grill(20);

        System.out.println("\n=== 6. Sealed Interface ===");
        MenuBehavior mb = new Pizza("Pepperoni", 10.99, 950, "Classic");
        System.out.println("Category: " + mb.getCategory());

        System.out.println("\n=== 7. Comparable + Generic ===");
        Pizza p1 = new Pizza("Margherita", 8.99, 850, "Classic");
        Pizza p2 = new Pizza("BBQ Chicken", 12.99, 1100, "Specialty");
        processOrder(p1, p2);
        processOrder(p2, p1);

        System.out.println("\n=== 8. Pattern Matching ===");
        Object[] mixed = {
                new Pizza("Veggie", 9.99, 750, "Healthy"),
                new Burger("Mushroom", 9.99, 720, "Specialty"),
                new Drink("Mango Smoothie", 4.99, 320, "Cold"),
                "Random String",
                42
        };

        for (Object item : mixed) {
            if (item instanceof Bakeable b) {
                b.bake(300);
            } else if (item instanceof Grillable g) {
                g.grill(15);
            } else if (item instanceof Drinkable d) {
                d.blend("Mango");
            } else if (item instanceof Comparable<?> c) {
                System.out.println("Comparable: " + item.getClass().getSimpleName());
            } else {
                System.out.println("Unknown: " + item);
            }
        }
    }

    public static <T extends Comparable<T>> void processOrder(T a, T b) {
        int result = a.compareTo(b);
        if (result > 0) {
            System.out.println(a.getClass().getSimpleName() + " is more expensive");
        } else if (result < 0) {
            System.out.println(a.getClass().getSimpleName() + " is cheaper");
        } else {
            System.out.println("Same price");
        }
    }
}