package PizzaSystem;

public final class Pizza extends MenuItem
        implements Bakeable, Comparable<Pizza> {

    public Pizza(String name, double price, int calories, String category) {
        super(name, price, calories, category);
    }

    @Override
    public String getItemType() {
        return "Pizza";
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void prepare(String chef) {
        System.out.println(chef + " is preparing " + name);
    }

    @Override
    public void serve(int tableNo) {
        System.out.println(name + " served to table " + tableNo);
    }

    @Override
    public void bake(int tempC) {
        if (tempC > MAX_TEMP) {
            System.out.println("Warning: Too hot for " + name + "!");
        } else {
            System.out.println(name + " baking at " + tempC + "°C");
        }
    }

    @Override
    public int compareTo(Pizza other) {
        return Double.compare(price, other.price);
    }
}