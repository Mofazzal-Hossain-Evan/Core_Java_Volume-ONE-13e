package lambda_lab;

import java.util.function.*; // Function, BiFunction ইন্টারফেস ইম্পোর্ট

public class FunctionTypeDemo {

    public static void runDemo() {
        // 🔸 BiFunction<T, U, R> → apply(T, U)
        // এখানে দুটি ইনপুট String এবং একটি আউটপুট Integer
        BiFunction<String, String, Integer> compareLength =
                (first, second) -> first.length() - second.length();

        // 🔸 apply() দিয়ে ফাংশন এক্সিকিউট করা
        int result = compareLength.apply("Java", "Python");
        System.out.println("📏 Length Difference: " + result);

        // 🔸 Function<T, R> → apply(T)
        // একটিমাত্র ইনপুট নেয়, একটি আউটপুট দেয়
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("🔡 'Lambda' length: " + stringLength.apply("Lambda"));

        // 🔹 ব্যাখ্যা:
        // BiFunction এবং Function হলো generic functional interfaces
        // যেগুলোতে ইনপুট ও আউটপুট টাইপ নির্ধারণ করা যায়।
    }
}
