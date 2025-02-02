package ShoppingCartSystem;

public class Cart {
    Product[] products;
    int count;
    //int size;

    public Cart( int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count=+1;
        } else {
            System.out.println("Cart is full");
        }
    }

public void showCart() {
    System.out.println("Shopping Cart:");
    for (int i =0; i < count; i++) {
        products[i].display();
    }
}
}
