package PizzaSystem;

public interface Drinkable extends Orderable {
    double MAX_SUGAR = 100.0;
    void blend(String flavor);
}