import java.util.Scanner;

public class DataValidationTool {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers to calculate their sum (negative numbers will be ignored):");
        System.out.println("Enter 0 to finish.");

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num ==  0) {
                break;
            }

            if(num == 0) {
                break;
            }

            if(num < 0) {
                System.out.println("Negative number ignored.");
                continue;
            }
            sum = sum + num;
        }
        System.out.println("The sum of valid numbers is: " + sum);
        input.close();
    }
}
