import java.util.Scanner;

public class ArrayStatistics {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        
        int n = in.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
            //The statement numbers[i] = scanner.nextInt();
            // works by combining array indexing and user input
            // into one operation.
            
        }
        
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double)n));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    
}
