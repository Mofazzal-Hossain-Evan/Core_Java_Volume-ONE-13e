package OnlineShoppingSystem;

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        Electronics electronics = new Electronics("Smartphone", 1000, 150);
        Product product = new Product("Basic Item", 50);

        System.out.println("Discounted price for " + electronics.name + ": " + electronics.calculateDiscountPrice());
        System.out.println("Price for basic product: " + product.calculateDiscountPrice());

    }
}
