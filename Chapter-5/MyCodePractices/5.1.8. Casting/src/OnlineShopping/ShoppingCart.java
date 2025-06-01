package OnlineShopping;

public class ShoppingCart {
    public static void main(String[] args) {

        Product [] cart = {
                new Electronics("Laptop", 80000),
                new Clothes("T-Shirt", 500),
                new Grocery("Apple", 200),
                new Oil("Soya", 90.00)
        };

        for (Product p : cart) {
            p.applyDiscount();
        }

        if (cart[0] instanceof Electronics) {
            Electronics e = (Electronics) cart[0];
            System.out.println("Electronic product found.");
        }

        if (cart[1] instanceof Oil){
            Oil o = (Oil) cart[1];
            System.out.println("Oil found");
        }
    }
}
