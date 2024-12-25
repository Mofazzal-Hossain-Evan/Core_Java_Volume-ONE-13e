package GeometryCalculator;

import java.util.Scanner;



public class GeometryCalculator {

    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);

        System.out.println("Welcome to the Geometry and Exponential Spiral Calculator!");
        System.out.println("Choose an option:");
        System.out.println("1. Calculate properties of a circle");
        System.out.println("2. Calculate properties of an exponential spiral");

        int choise = scanned.nextInt();

        if(choise == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanned.nextDouble();

            double circumference = 2 * Math.PI + radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Circle Properties:");
            System.out.printf("Radius: %.2f%n", radius);
            System.out.printf("Circumference: %.2f%n", circumference);
            System.out.printf("Area: %.2f%n", area);

        } else if (choise == 3) {
            System.out.print("Enter the angle (in degrees): ");
            double angleDegrees = scanned.nextDouble();
            double angleRadians = Math.toRadians(angleDegrees);

            double exponentialValue = Math.pow(Math.E, angleRadians);
            double x = exponentialValue * Math.cos(angleRadians);
            double y = exponentialValue * Math.sin(angleRadians);

            System.out.println("Exponential Spiral Properties:");
            System.out.printf("Angle (degrees): %.2f%n", angleDegrees);
            System.out.printf("Exponential Value: %.2f%n", exponentialValue);
            System.out.printf("x-coordinate: %.2f%n", x);
            System.out.printf("y-coordinate: %.2f%n", y);

        } else  {
            System.out.println("Invalid choice. Please restart the program.");
        }
        System.out.println("Thank you for using the calculator!");
        scanned.close();


    }
}
