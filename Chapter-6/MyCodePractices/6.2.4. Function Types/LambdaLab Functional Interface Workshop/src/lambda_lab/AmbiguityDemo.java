package lambda_lab;

import java.util.function.*;

public class AmbiguityDemo {

    // 🔸 দুটি overloaded fill() মেথড তৈরি করা হলো
    public static int[] fill(int n, IntUnaryOperator op) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = op.applyAsInt(i);
        return arr;
    }

    public static Object[] fill(int n, IntFunction<Object> op) {
        Object[] arr = new Object[n];
        for (int i = 0; i < n; i++) arr[i] = op.apply(i);
        return arr;
    }

    public static void runDemo() {
        // ❌ নিচের লাইনটি ambiguous error দেবে
        // fill(5, i -> i * i);
        // কারণ: ল্যাম্বডা টি একই সঙ্গে IntUnaryOperator এবং IntFunction<Object> এর সাথেও মিলতে পারে

        System.out.println("⚠️ Ambiguity example: fill(5, i -> i * i) will not compile!");
        System.out.println("কারণ: lambda টি দুটো method এর সাথেই মিলে যায় (IntUnaryOperator ও IntFunction<Object>)।");
    }
}
