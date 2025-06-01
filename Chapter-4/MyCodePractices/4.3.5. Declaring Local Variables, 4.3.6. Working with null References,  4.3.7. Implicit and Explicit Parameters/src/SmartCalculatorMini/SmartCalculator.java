package SmartCalculatorMini;

import java.util.Objects;
import java.util.Scanner;

public class SmartCalculator {

    public static Double divide(double a, double b){
        return (b == 0) ? null : a / b;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Enter numerator: ");
        var num1 = scanner.nextDouble();

        System.out.println("Enter denomiter");
        var num2 = scanner.nextDouble();

        var result = divide(num1, num2);
        System.out.println("Result: " + Objects.requireNonNullElse(result,"Undefined (Division by Zero)" ));

        scanner.close();


    }
}
