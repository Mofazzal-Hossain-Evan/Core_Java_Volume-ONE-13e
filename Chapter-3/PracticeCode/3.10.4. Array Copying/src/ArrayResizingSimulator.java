import java.util.Arrays;

public class ArrayResizingSimulator {
    
    public static void main(String[] args) {
        
        int [] array = new int[5];
        int size = 0;
        
        for( int i = 1; i<= 15; i++) {
            if(size == array.length) {
                System.out.println("Array is full. Resizing to " + (array.length * 2));
                array = Arrays.copyOf(array, array.length * 2);
            }
            
            array[size] = i;
            size++;
            System.out.println("Array: " + Arrays.toString(array));
        }

        
    }
}
