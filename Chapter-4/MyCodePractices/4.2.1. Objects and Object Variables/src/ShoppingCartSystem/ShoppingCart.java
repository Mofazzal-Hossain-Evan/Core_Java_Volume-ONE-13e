package ShoppingCartSystem;

public class ShoppingCart {
    public static void main(String[] args) {
        Cart cart =  new Cart(3);

        cart.addProduct(new Product("Laptop", 1200.99, 1));
        cart.addProduct(new Product("Phone", 699.49, 2));

        cart.showCart();
    }
}
