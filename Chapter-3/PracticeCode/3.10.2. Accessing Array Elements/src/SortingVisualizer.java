import java.util.Arrays;

public class SortingVisualizer {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
    for(int i = 0; i< arr.length - 1; i++) {
        for(int j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j] > arr[j + i]) {
                int temp = arr[j];
                arr[j + i] = temp;
            }
        }
        System.out.println("Step " + Arrays.toString(arr));
    }

    }
}
