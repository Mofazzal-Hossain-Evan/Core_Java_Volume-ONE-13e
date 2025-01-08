import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class PrecisionCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Enter operation: add, subtract, multiply, divide, mod, power");
            String operation = in.next();

            System.out.println("Enter first number: ");
            BigDecimal num1 = new BigDecimal(in.next());

            System.out.print("Enter second number: ");
            BigDecimal num2 = new BigDecimal(in.next());

            BigDecimal result = BigDecimal.ZERO;

            switch (operation.toLowerCase()) {
                case "add":
                    result = num1.add(num2);
                    break;

                case "Subtract" :
                    result = num1.subtract(num2);
                    break;
                case "multiply" :
                    result = num1.multiply(num2);
                    break;
                case "divide":
                    System.out.print("Choose RoundingMode (e.g., HALF_UP): ");
                    RoundingMode mode = RoundingMode.valueOf(in.next());
                    result = num1.divide(num2, mode);
                    break;

                case "mod" :
                    result = new BigDecimal(num1.toBigInteger().mod(num2.toBigInteger()));
                    break;

                case "power" :
                    result = new BigDecimal((num1.toBigInteger().pow(num2.intValue())));
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            System.out.printf("Result: %s%n", result);
            System.out.print("Do you want to calculate again? (yes/no): ");
            if(!in.next().equalsIgnoreCase("yes")) break;
        }
    }
}
