package Calculation;

public class MathConstants {

    public static void main(String[] args) {
        double pi = Math.PI;       // Value of π (3.14159...)
        double tau = 2 * Math.PI;  // Value of τ (2π), since Math.TAU is not available in Java
        double e = Math.E;         // Value of Euler's number (2.718...)

        // Print the constants
        System.out.println("Value of π (PI): " + pi);
        System.out.println("Value of τ (TAU): " + tau);
        System.out.println("Value of e (Euler's Number): " + e);

    }
}
