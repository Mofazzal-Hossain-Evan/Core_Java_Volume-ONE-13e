package PizzaSystem;

public final class Burger extends MenuItem
        implements Grillable, Comparable<Burger> {

    public Burger(String name, double price, int calories, String category) {
        super(name, price, calories, category);
    }

    @Override
    public String getItemType() {
        return "Burger";
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
    public void grill(int minutes) {
        if (minutes > MAX_TIME) {
            System.out.println("Warning: Over grilling " + name + "!");
        } else {
            System.out.println(name + " grilling for " + minutes + " mins");
        }
    }

    @Override
    public int compareTo(Burger other) {
        return Double.compare(price, other.price);
    }
}