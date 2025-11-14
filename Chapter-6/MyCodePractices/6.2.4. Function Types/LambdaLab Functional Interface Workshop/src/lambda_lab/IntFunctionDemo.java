package lambda_lab;

import java.util.Arrays;
import java.util.function.*;

public class IntFunctionDemo {

    public static void runDemo() {
        // 🔸 Arrays.setAll() ব্যবহার করে IntUnaryOperator
        // IntUnaryOperator → int applyAsInt(int operand)
        int[] squares = new int[10];
        Arrays.setAll(squares, i -> i * i); // প্রতিটি ইন্ডেক্সের জন্য i*i
        System.out.println("🔢 Squares: " + Arrays.toString(squares));

        // 🔸 ToIntFunction<T> → int applyAsInt(T value)
        // একটি String এর দৈর্ঘ্য বের করা
        ToIntFunction<String> strLength = s -> s.length();
        System.out.println("📐 Length of 'Hello': " + strLength.applyAsInt("Hello"));

        // 🔸 IntFunction<T> → T apply(int value)
        // সংখ্যাকে ব্যবহার করে * রিপিট করা
        IntFunction<String> repeatStar = n -> "*".repeat(n);
        System.out.println("⭐ Stars: " + repeatStar.apply(5));

        // 🔹 ব্যাখ্যা:
        // primitive functional interfaces ব্যবহার করলে boxing/unboxing হয় না।
        // তাই performance ভালো হয়।
    }
}
