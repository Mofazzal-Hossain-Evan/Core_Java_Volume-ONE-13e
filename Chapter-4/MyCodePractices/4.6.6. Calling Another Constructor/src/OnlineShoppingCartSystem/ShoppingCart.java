package OnlineShoppingCartSystem;

public class ShoppingCart {
    public static void main(String[] args) {

       CartItem c1 = new CartItem("Laptop");// Defaults to quantity = 1
        CartItem c2 = new CartItem("Mouse", 3); // Sets quantity to 3

        c1.display();
        c2.display();
    }
}
