package PizzaSystem;

public non-sealed interface Orderable extends MenuBehavior
      {

    void prepare(String chef);
    void serve(int tableNo);
}