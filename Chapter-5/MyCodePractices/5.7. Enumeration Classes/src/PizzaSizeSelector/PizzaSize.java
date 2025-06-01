package PizzaSizeSelector;

public enum PizzaSize {
    SMALL("Eat alone", 299, 800),
    MEDIUM("Share with cat", 499, 1200),
    LARGE("One friend maybe", 699, 1600),
    EXTRA_LARGE("Family feast", 899, 2100),
    XXL("Regret later", 1099, 2800);

    private final String description;
    private final int price;
    private final int calories;

    PizzaSize(String description, int price, int calories) {
        this.description = description;
        this.price = price;
        this.calories = calories;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }
    public int getCalories() {
        return calories;
    }
}
