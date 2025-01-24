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

/*
* 1. The Purpose of the Inner Loop
The inner loop is responsible for comparing and swapping adjacent elements to ensure that the largest unsorted element "bubbles up" to its correct position at the end of the array in each pass.

2. n and i in Context
n: The total number of elements in the array.
i: The index of the current pass in the outer loop (the number of iterations completed so far).
3. Why n - i - 1?
With each pass (ith pass), the largest element of the unsorted portion is moved to its correct position at the end of the array.
Once the largest element is sorted, you don’t need to compare it again in subsequent passes.
Hence, the range of the inner loop (j) is reduced by 1 for each pass.
In the first pass (i = 0): You compare all pairs up to the second last element (j < n - 1).
In the second pass (i = 1): You compare up to the third last element (j < n - 2).
And so on...
Visualization of Each Pass
Let’s take an array [5, 3, 4, 1, 2] and see how n - i - 1 works:

Pass 1 (i = 0, j < n - i - 1 → j < 5 - 0 - 1 → j < 4):
Comparisons: j = 0 to 3 (compare 5-3, 3-4, 4-1, 1-2).
Largest element 5 is placed at the last position.
Pass 2 (i = 1, j < n - i - 1 → j < 5 - 1 - 1 → j < 3):
Comparisons: j = 0 to 2 (compare 3-4, 4-1, 1-2).
Second largest element 4 is placed at the second last position.
Pass 3 (i = 2, j < n - i - 1 → j < 5 - 2 - 1 → j < 2):
Comparisons: j = 0 to 1 (compare 3-1, 1-2).
Third largest element 3 is placed.
Pass 4 (i = 3, j < n - i - 1 → j < 5 - 3 - 1 → j < 1):
Comparisons: j = 0 (compare 1-2).
Fourth largest element 2 is placed.
* */