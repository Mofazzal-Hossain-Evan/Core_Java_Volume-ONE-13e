import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "4323";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter your password: ");
            String input2 = input.nextLine();

            if (input2.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Too many failed attempts. Access denied.");
        }
    input.close();
    }
}
