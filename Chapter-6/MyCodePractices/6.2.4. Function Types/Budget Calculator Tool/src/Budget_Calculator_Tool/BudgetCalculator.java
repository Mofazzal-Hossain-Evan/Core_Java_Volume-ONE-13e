/* Package declaration */
package Budget_Calculator_Tool;

import java.util.*;
import java.util.function.*;

/* থিয়রি: *Core Java* (p. 274) — BiFunction ক্রিয়েশন, IntFunction স্কেলিং, Predicate ফিল্টারিং। */

public class BudgetCalculatorTool {
    public static void main(String[] args) {
        // ১. এক্সপেন্স ক্রিয়েটর (BiFunction)
        BiFunction<String, Double, Expense> expenseCreator =
                (cat, amt) -> new Expense(cat, amt);

        // ২. স্কেলার (IntFunction<Double>)
        IntFunction<Double> scaler = scale -> 50.0 * scale;

        // ৩. স্কেলড অ্যামাউন্ট অ্যারে (IntUnaryOperator + Arrays.setAll)
        IntUnaryOperator scaleOp = i -> i + 1; // 1, 2, 3, ...
        int numExpenses = 5;
        double[] scaledAmounts = new double[numExpenses];
        Arrays.setAll(scaledAmounts, i -> scaler.apply(scaleOp.applyAsInt(i)));

        // ৪. মজার ক্যাটাগরি
        String[] categories = {
                "Coffee for Coders", "Pizza for Pair Programming",
                "Budget for Infinite Loops", "Cloud Storage for Dreams",
                "Server Rent for Memes"
        };

        // ৫. এক্সপেন্স লিস্ট তৈরি
        List<Expense> budget = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numExpenses; i++) {
            String cat = categories[random.nextInt(categories.length)];
            budget.add(expenseCreator.apply(cat, scaledAmounts[i]));
        }

        System.out.println("Initial Budget:");
        budget.forEach(System.out::println);
        System.out.println();

        // ৬. ওভার-বাজেট ফেলে দেওয়া (Predicate + removeIf)
        Predicate<Expense> overBudget = exp -> exp.getAmount() > 150.0;
        budget.removeIf(overBudget);

        System.out.println("After removing expenses over $150:");
        budget.forEach(System.out::println);
        System.out.println();

        // ৭. টোটাল বাজেট ক্যালকুলেট
        double total = budget.stream()
                .mapToDouble(Expense::getAmount)
                .sum();

        System.out.println("Total Budget Remaining: $" + String.format("%.2f", total));
        System.out.println();

        // ৮. ডিফল্ট এক্সপেন্স (Supplier + Objects.requireNonNullElseGet)
        Supplier<Expense> defaultExpense = () -> new Expense("Emergency Fund", 100.0);
        Expense missing = null;
        Expense safe = Objects.requireNonNullElseGet(missing, defaultExpense);
        System.out.println("Safe Default Expense: " + safe);
    }
}