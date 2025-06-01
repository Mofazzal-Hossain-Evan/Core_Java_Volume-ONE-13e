package DinosaurDNAComparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

import static SmartComparisonEngine.DeepComparer.deepPrint;

public class DeepComparer {

    public static void compareObject(Object a, Object b){
        System.out.println("🔬 Comparing Objects:");
        System.out.println("🅰️ " + deepPrint(a));
        System.out.println("🅱️ " + deepPrint(b));

        boolean equal = Objects.equals(a, b);
        boolean hashMatch = a != null && b != null && a.hashCode() == b.hashCode();
        System.out.println("✔ equals(): "+ equal);
        System.out.println("✔ hashCode match: "+ hashMatch);

        if (equal && !hashMatch){
            System.out.println("⚠️ Warning: equals() true but hashCodes differ!");
        } else if (!equal && hashMatch) {
            System.out.println("😮 Strange: hashCodes same but not equal.");
        }


        System.out.println("-----------------------------------");
    }

    public static String deepPrint(Object obj){
        if (obj ==  null) return "Null";
        if (obj.getClass().isArray()){
            return Arrays.deepToString(new Object[]{obj});
        }
        return obj.toString();
    }
}

//Objects হলো একটি class (java.util.Objects), য
// েটা utility method দেয় equals, hash, requireNonNull ইত্যাদির জন্য।

//কিন্তু deepPrint মেথডে আমরা obj প্যারামিটার হিসেবে পাঠাতে চাইছি যেকোনো Object,
// অর্থাৎ java.lang.Object।
