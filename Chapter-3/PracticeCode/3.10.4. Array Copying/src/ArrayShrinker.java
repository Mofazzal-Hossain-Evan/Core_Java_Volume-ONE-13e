import java.util.Arrays;

public class ArrayShrinker {
    
    public static void main(String[] args) {
        int[] array ={10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        int removeIndex = 3;
        for(int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        array = Arrays.copyOf(array, array.length - 1);
        System.out.println("Array after removing index " + removeIndex + ": " + Arrays.toString(array));
        
    }
    
}
