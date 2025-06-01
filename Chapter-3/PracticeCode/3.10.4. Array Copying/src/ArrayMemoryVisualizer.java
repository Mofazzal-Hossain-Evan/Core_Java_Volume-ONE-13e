import java.util.Arrays;

public class ArrayMemoryVisualizer {
    
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] shallowCopy = original;
        int[] deepCopy = Arrays.copyOf(original, original.length);
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("shallow copy: " + Arrays.toString(shallowCopy));
        System.out.println("Deep Copy: " + Arrays.toString(deepCopy));
        
        System.out.println("\nModifying original...");
        original[2] = 99;
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("shallow copy: " + Arrays.toString(shallowCopy));
        System.out.println("Deep Copy: " + Arrays.toString(deepCopy));
        
    }
    
}
