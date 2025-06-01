package CustomerOrderSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var orders = new ArrayList<String>();

        while (true) {
            System.out.println("Enter a product name (or type 'done' to finish): ");
            var product = scanner.nextLine();

            if ("Done".equalsIgnoreCase(product)) break;

            if (product == null || product.trim().isEmpty()) {
                System.out.println("Invalid product name! Try again.");
            } else {
                orders.add(product);
            }
        }
        System.out.println("\nOrder List");
        for (var order : orders) {
            System.out.println("+ :" + order);
        }
        scanner.close();
    }
}
