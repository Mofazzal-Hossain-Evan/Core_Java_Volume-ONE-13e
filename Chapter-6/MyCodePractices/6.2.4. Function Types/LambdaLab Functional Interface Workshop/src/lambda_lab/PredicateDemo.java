package lambda_lab;

import java.util.*;
import java.util.function.Predicate; // Predicate<T> ইন্টারফেস import করা হচ্ছে

public class PredicateDemo {

    public static void runDemo() {
        // 🔸 ArrayList তৈরি করা, যেখানে কিছু null মান আছে
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", null, "Python", null, "C++"));

        System.out.println("🧾 Before removeIf: " + list);

        // 🔸 Predicate<T> হলো functional interface, যেখানে একটি মাত্র abstract method আছে:
        // boolean test(T t)
        Predicate<String> isNull = e -> e == null; // ল্যাম্বডা দিয়ে test() এর কাজ সংজ্ঞায়িত

        // 🔸 removeIf() মেথডে Predicate পাস করা
        // Predicate test() যদি true রিটার্ন করে, তাহলে সেই এলিমেন্ট রিমুভ হয়ে যায়।
        list.removeIf(isNull);

        System.out.println("✅ After removeIf: " + list);

        // 🔹 ব্যাখ্যা:
        // removeIf() method functional interface Predicate<T> এর সাহায্যে
        // কনডিশনাল (শর্তসাপেক্ষ) এলিমেন্ট রিমুভ করে।
    }
}
