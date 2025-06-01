package HighPerformanceECommerceSystem;

public class ECommerceSystem {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Display product prices
        System.out.println("Price of " + product1.getName() + ": $" + product1.getPrice());
        System.out.println("Price of " + product2.getName() + ": $" + product2.getPrice());
        System.out.println("Price of " + product3.getName() + ": $" + product3.getPrice());
    }
}
