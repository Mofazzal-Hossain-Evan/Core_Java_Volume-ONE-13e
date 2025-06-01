package OnlineShoppingCartSystem;

public class CartItem {
    private String productName;
    private int quantity;

    // Constructor 1: If only product name is given, default quantity is 1

    public CartItem(String productName) {
        this(productName, 1); // Calls the second constructor
    }

    public CartItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
    public void display(){
        System.out.println("Product: " + productName + " | Quantity: " + quantity);

    }
}
