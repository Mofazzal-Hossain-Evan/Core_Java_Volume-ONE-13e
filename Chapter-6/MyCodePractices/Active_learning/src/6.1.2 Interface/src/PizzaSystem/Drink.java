package PizzaSystem;

public final class Drink extends MenuItem
        implements Drinkable, Comparable<Drink> {

    public Drink(String name, double price, int calories, String category) {
        super(name, price, calories, category);
    }

    @Override
    public String getItemType() {
        return "Drink";
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
    public void blend(String flavor) {
        System.out.println(name + " blended with " + flavor + " flavor");
    }

    @Override
    public int compareTo(Drink other) {
        return Double.compare(price, other.price);
    }
}