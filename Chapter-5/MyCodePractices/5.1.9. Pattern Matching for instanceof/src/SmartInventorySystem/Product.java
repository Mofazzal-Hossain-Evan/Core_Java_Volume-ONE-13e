package SmartInventorySystem;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}
