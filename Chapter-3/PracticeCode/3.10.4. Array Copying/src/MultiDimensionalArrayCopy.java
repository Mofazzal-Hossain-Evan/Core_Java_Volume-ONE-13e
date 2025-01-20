import java.util.Arrays;

public class MultiDimensionalArrayCopy {
    
    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        // Shallow copy
        int[][] shallowCopy = Arrays.copyOf(original, original.length);
        
        int[][] deepCopy = new int[original.length][];
        for(int i = 0; i < original.length; i++) {
            deepCopy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        
        //modify original
        original[1][1] = 99;
        
        System.out.println("Original: " + Arrays.deepToString(original));
        System.out.println("Shallow Copy: " + Arrays.deepToString(shallowCopy));
        System.out.println("Deep Copy: " + Arrays.deepToString(deepCopy));
    }
    
}
