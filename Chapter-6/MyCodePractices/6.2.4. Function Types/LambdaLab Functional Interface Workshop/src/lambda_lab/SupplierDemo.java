package lambda_lab;

import java.time.LocalDate;  // LocalDate ব্যবহার হবে
import java.util.Objects;    // requireNonNullElseGet এর জন্য
import java.util.function.Supplier; // Supplier<T> ইন্টারফেস

public class SupplierDemo {

    public static void runDemo() {
        LocalDate day = null; // 🔸 day শুরুতে null

        // 🔸 Supplier<T> এর get() method কোনো parameter নেয় না, কিন্তু কিছু রিটার্ন করে
        // এখানে get() কল করলে একটি default তারিখ তৈরি হবে
        Supplier<LocalDate> defaultDate = () -> {
            System.out.println("📅 Default date created lazily!");
            return LocalDate.of(1970, 1, 1);
        };

        // 🔸 requireNonNullElseGet() শুধুমাত্র তখনই Supplier চালায় যদি day null হয়
        LocalDate hireDay = Objects.requireNonNullElseGet(day, defaultDate);

        System.out.println("🗓️ Final Hire Date: " + hireDay);

        // 🔹 ব্যাখ্যা:
        // Supplier lazily value প্রদান করে, মানে দরকার না হলে তা execute হয় না।
    }
}
