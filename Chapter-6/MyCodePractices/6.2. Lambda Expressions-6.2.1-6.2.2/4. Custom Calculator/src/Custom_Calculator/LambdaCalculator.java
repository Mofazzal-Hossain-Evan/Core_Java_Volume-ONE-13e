package Custom_Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Functional Interface (lambda এর জন্য দরকার)


public class LambdaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lambda দিয়ে operations define
        Map<String, Operation> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);              // যোগ
        operations.put("-", (a, b) -> a - b);              // বিয়োগ
        operations.put("*", (a, b) -> a * b);              // গুণ
        operations.put("/", (a, b) -> {
            if (b == 0) throw new ArithmeticException("❌ Division by zero!");
            return a / b;
        });

        System.out.println("=== 🧮 Lambda Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        String op = sc.next();

        // এখানে lambda চালানো হচ্ছে
        if (operations.containsKey(op)) {
            double result = operations.get(op).apply(num1, num2);
            System.out.println("✅ Result = " + result);
        } else {
            System.out.println("❌ Invalid operator!");
        }
    }
}
