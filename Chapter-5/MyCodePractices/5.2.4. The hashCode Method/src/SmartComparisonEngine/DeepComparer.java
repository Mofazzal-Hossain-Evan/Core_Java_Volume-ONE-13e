package SmartComparisonEngine;


import java.util.Arrays;
import java.util.Objects;

public class DeepComparer {

    public static void compareObjects(Object a, Object b){
        System.out.println("🔍 Comparing objects:");
        System.out.println("A: "+ deepPrint(a));
        System.out.println("B: " + deepPrint(b));

        boolean equal = Objects.equals(a, b);

        boolean hashMatch = a != null && b != null && a.hashCode() == b.hashCode();

        System.out.println("✔ equals(): " + equal);
        System.out.println("✔ hashCode match: " + hashMatch);

        if (equal && !hashMatch) {
            System.out.println("⚠️ Warning: equals() true but hashCode different — violates contract!");
        } else if (!equal && hashMatch){
            System.out.println("ℹ️ Interesting: hashCode same but not equal.");
        }
        System.out.println("--------------------------------------------");

    }

    public static String deepPrint(Object obj){
        if (obj == null) return "null";
        if (obj.getClass().isArray()) {
            return Arrays.deepToString(new Object[]{obj});
        }
        return obj.toString();
    }
}
