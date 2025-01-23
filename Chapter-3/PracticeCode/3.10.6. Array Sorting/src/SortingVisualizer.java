import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

import static java.lang.reflect.Array.*;

public class SortingVisualizer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input array
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = in.nextLine().split(" ");
        int[] array = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        //Buble sort
        System.out.println("\nSorting Process: ");
        bubbleSortWIthSteps(array);
    }

    private static void bubbleSortWIthSteps(int[] array) {
        int n= array.length;
        for (int i= 0; i <n -1; i++) {
            for (int j = 0; j < n -i -1; j++){
                if( array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Step " + (i + 1) +": "+ Arrays.toString(array));
        }
    }
}
