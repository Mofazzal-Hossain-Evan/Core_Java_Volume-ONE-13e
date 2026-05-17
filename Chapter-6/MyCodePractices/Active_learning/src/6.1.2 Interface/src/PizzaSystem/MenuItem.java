package PizzaSystem;

public abstract non-sealed class MenuItem implements MenuBehavior {

    protected String name;
    protected double price;
    protected int calories;
    protected String category;

    public MenuItem(String name, double price, int calories, String category) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.category = category;
    }

    public String getName()     { return name; }
    public double getPrice()    { return price; }
    public int    getCalories() { return calories; }

    public abstract String getItemType();

    @Override
    public String toString() {
        return getItemType() + " | " + name +
                " | $" + price +
                " | " + calories + " cal";
    }
}