import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        System.out.print("Reversed Array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
