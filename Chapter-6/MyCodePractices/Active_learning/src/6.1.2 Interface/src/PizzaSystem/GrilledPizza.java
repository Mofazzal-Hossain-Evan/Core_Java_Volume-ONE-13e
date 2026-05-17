package PizzaSystem;

public final class GrilledPizza extends MenuItem
        implements Bakeable, Grillable, Comparable<GrilledPizza> {

    public GrilledPizza(String name, double price, int calories, String category) {
        super(name, price, calories, category);
    }

    @Override
    public String getItemType() {
        return "GrilledPizza";
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
        System.out.println(name + " baking at " + tempC + "°C");
    }

    @Override
    public void grill(int minutes) {
        System.out.println(name + " grilling for " + minutes + " mins");
    }

    @Override
    public int compareTo(GrilledPizza other) {
        return Double.compare(price, other.price);
    }
}