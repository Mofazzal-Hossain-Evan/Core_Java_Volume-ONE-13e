package PizzaSystem;

public interface Grillable extends Orderable {
    double MAX_TIME = 60.0;
    void grill(int minutes);
}