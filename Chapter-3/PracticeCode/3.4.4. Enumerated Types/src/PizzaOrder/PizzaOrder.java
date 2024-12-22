package PizzaOrder;

public class PizzaOrder {

    public static void main(String[] args) {
        Pizza myPizza = new Pizza(Size.LARGE);

        System.out.println("You ordered a pizza of size: " + myPizza.getSize());

        myPizza.setSize(Size.SMALL);

        System.out.println("The size has been changed to: "+myPizza.getSize());
    }

}
