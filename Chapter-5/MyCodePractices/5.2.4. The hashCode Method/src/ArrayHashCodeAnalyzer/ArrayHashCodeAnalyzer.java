package ArrayHashCodeAnalyzer;

import java.util.Arrays;
import java.util.Objects;

public class ArrayHashCodeAnalyzer {
    public static void main(String[] args) {

        int[] intArray = {1,2,3};

        String [] atrArray = {"Java", "GPT", null};

        String[][] deepArray = {
                {"A", "B"},
                {"C", null}
        };

        System.out.println("==== 1D Primitive Array (int[]) ====");
        analyze(intArray);

        System.out.println("\n==== 1D Object Array (String[]) ====");
        analyze(deepArray);
    }

    public static void analyze(Object array){
        System.out.println("Array: " +Arrays.deepToString(new Object[]{array}));
        System.out.println("Object.hashCode(): " + array.hashCode());
        System.out.println("Arrays.hashCode(): " + Arrays.hashCode(new Object[]{array}));
        System.out.println("Arrays.deepHashCode(): " + Arrays.deepHashCode(new Object[]{array}));
        System.out.println("Objects.hash(): " + Objects.hash(array));
    }
}
