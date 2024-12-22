package ShoppingCart;

import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner reply = new Scanner(System.in);

        boolean hasItems = false;
        double TotalCost = 0.00;

        System.out.println("Welcome to the Shopping Cart!");
        System.out.println("Enter the price of an item to add it to your cart. Enter 0 to finish.");

        while(true) {
            System.out.println("Enter item price: ");
            double itemPrice = reply.nextDouble();

            if(itemPrice == 0) {
                break;
            }
            if(itemPrice > 0) {
                TotalCost += itemPrice;
                hasItems = true; // Mark that the cart now has items
            } else {
                System.out.println("Invalid price! Please enter a positive value.");
            }
        }
// Check if the cart has items
        if (hasItems) {
            System.out.printf("Your total cost is: $%.2f%n ", TotalCost);
        } else {
            System.out.println("Your cart is empty. No items purchased.");
        }

        System.out.println("Thank you for shopping with us!");
        reply.close();
    }
}
