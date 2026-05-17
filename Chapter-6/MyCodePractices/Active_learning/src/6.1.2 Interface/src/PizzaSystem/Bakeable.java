package PizzaSystem;

public interface Bakeable extends Orderable {
    double MAX_TEMP = 500.0;
    void bake(int tempC);
}