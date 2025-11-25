package User_Profile_Comparator;

import java.util.Comparator;

public class ComparatorDemo {

    // 1. Ascending Order Comparator (a - b)
    static Comparator<Integer> asc = (a, b) -> a - b;

    // 2. Descending Order Comparator (b - a)
    static Comparator<Integer> desc = (a, b) -> b - a;

    // 3. Safe Comparator (no overflow)
    static Comparator<Integer> safe = Integer::compare;

    // 4. Custom Comparator: even numbers first, then ascending
    static Comparator<Integer> evenFirst = (a, b) -> {
        boolean aEven = (a % 2 == 0);
        boolean bEven = (b % 2 == 0);

        if (aEven && !bEven) return -1;  // a আগে (কারণ জোড়)
        if (!aEven && bEven) return 1;   // b আগে (কারণ জোড়)
        return a - b; // otherwise ascending
    };

    public static void main(String[] args) {

        System.out.println("=== Ascending Comparator ===");
        System.out.println(asc.compare(5, 10)); // -5
        System.out.println(asc.compare(10, 5)); // 5
        System.out.println(asc.compare(7, 7));  // 0

        System.out.println("\n=== Descending Comparator ===");
        System.out.println(desc.compare(5, 10)); // 5
        System.out.println(desc.compare(10, 5)); // -5
        System.out.println(desc.compare(7, 7));  // 0

        System.out.println("\n=== Safe Comparator ===");
        System.out.println(safe.compare(5, 10)); // -1
        System.out.println(safe.compare(10, 5)); // 1
        System.out.println(safe.compare(7, 7));  // 0

        System.out.println("\n=== Even-First Comparator ===");
        System.out.println(evenFirst.compare(4, 7)); // -1 (4 আগে)
        System.out.println(evenFirst.compare(7, 2)); // 1 (2 আগে)
        System.out.println(evenFirst.compare(5, 9)); // -4 (normal asc: 5 - 9)
    }
}
