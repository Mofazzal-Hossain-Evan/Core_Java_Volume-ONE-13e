package Name_Transformer;

import java.util.Arrays;
import java.util.List;

public class NameTransformer {
    public static void main(String[] args) {
        // নামের লিস্ট
        List<String> names = Arrays.asList("alice", "BOB", "cHaRlIe", "diana");

        System.out.println("=== Original Names ===");
        names.forEach(name -> System.out.println(name));

        // সব ছোট হাতের অক্ষরে
        System.out.println("\n=== Lowercase Names ===");
        names.forEach(name -> System.out.println(name.toLowerCase()));

        // সব বড় হাতের অক্ষরে
        System.out.println("\n=== Uppercase Names ===");
        names.forEach(name -> System.out.println(name.toUpperCase()));

        // প্রথম অক্ষর ক্যাপিটালাইজ (rest ছোট হাতের)
        System.out.println("\n=== Capitalized Names ===");
        names.forEach(name -> {
            String transformed = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            System.out.println(transformed);
        });
    }
}
