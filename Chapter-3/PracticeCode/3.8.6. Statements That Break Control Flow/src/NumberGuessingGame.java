import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;

        System.out.println("Guess the number between 1 and 100 (or type 0 to exit):");

        while(true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == 0) {
                System.out.println("Exiting the game. Goodbye!");
                break;
            }

            if (guess == target) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < target) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        input.close();


    }
}
