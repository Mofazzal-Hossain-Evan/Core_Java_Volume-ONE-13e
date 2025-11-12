package lambda_lab;

import java.util.*;

// 🔹 Functional Interface demonstration with Comparator
public class ComparatorDemo {

    public static void runDemo() {
        // 🔸 একটি String array
        String[] words = {"elephant", "cat", "hippopotamus", "dog"};

        // 🔸 ল্যাম্বডা ব্যবহার করে Comparator তৈরি করা
        Arrays.sort(words, (first, second) -> first.length() - second.length());

        // 🔸 সাজানো ফলাফল প্রদর্শন
        System.out.println("👉 Sorted by length: " + Arrays.toString(words));

        // 🔹 ব্যাখ্যা:
        // এখানে Comparator<String> একটি functional interface (একটি মাত্র abstract method: compare())।
        // আমরা ল্যাম্বডা দিয়ে সেটির অবজেক্ট তৈরি করেছি।
    }
}
