package ShoppingCartSystem;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void display() {
        System.out.println(name + " - $" + price + " x " + quantity);
    }
}
