package OnlineShopping;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(){
        System.out.println(name + " has no discount." );
    }
}
