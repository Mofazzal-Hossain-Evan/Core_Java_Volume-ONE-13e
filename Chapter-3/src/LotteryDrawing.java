import java.util.*;

/**
 * This program demonstrates array manipulation.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryDrawing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);
    }
}

/***
 * This Java program simulates a lottery drawing. Let's break it down step by step:
 *
 * 1. Import and class declaration:
 *    - The program imports the java.util package for Scanner and Arrays classes.
 *    - It defines a public class named LotteryDrawing.
 *
 * 2. User input:
 *    - It uses Scanner to get two inputs from the user:
 *      - k: number of numbers to draw
 *      - n: highest possible number
 *
 * 3. Initialize numbers array:
 *    - Creates an array 'numbers' of size n
 *    - Fills it with numbers from 1 to n
 *
 * 4. Drawing process:
 *    - Creates a 'result' array of size k to store drawn numbers
 *    - For each draw:
 *      - Generates a random index r
 *      - Puts the number at index r of 'numbers' into 'result'
 *      - Replaces the drawn number with the last number in 'numbers'
 *      - Decreases n to shrink the pool of available numbers
 *
 * 5. Output:
 *    - Sorts the 'result' array
 *    - Prints each number in the sorted result
 *
 * The key aspect is the drawing algorithm, which ensures no number is drawn twice by swapping drawn numbers with the last available number and shrinking the pool.
 *
 * This method efficiently simulates drawing numbers without replacement, similar to how many lottery systems work.
 */