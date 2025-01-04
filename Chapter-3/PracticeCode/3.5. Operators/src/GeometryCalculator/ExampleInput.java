package GeometryCalculator;

import java.util.Scanner;

public class ExampleInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scan.nextInt();


        System.out.println("You entered radius: " + radius);
        System.out.println("You entered choice: " + choice);

        scan.close(); // Close the scanner
    }
}
