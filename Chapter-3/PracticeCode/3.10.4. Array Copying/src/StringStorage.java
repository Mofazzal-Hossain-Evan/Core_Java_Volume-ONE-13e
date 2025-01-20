import java.util.Arrays;
import java.util.Scanner;

public class StringStorage {
    
    public static void main(String[] args) {
        String[] strings = new String[3];
        int size = 0;
        
        Scanner scaned = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter a string (or 'exit' to stop): ");
            String input = scaned.nextLine();
            if(input.equals("exit")) break;
            
            if(size == strings.length) {
                System.out.println("Array is full. Resizing to " + (strings.length * 2));
                strings = Arrays.copyOf(strings, strings.length * 2);
            }
            strings[size++] = input;
            
            /**
             * Visual Representation:
             * Let’s say size = 0 initially, and we use numbers[size++] = value; in a loop. Here’s how it works:
             *
             * Iteration	size before	     Array Index Updated	Value Added	        size after
             * 1	0	0	10	1
             * 2	1	1	20	2
             * 3	2	2	30	3
             * By the end of all iterations, the array holds the added values, and size tracks the next available position.
             */
            System.out.println("Array: " + Arrays.toString(strings));
        }
    }
    
}
