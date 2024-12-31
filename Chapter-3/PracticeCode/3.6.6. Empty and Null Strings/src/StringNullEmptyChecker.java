import java.util.Scanner;

public class StringNullEmptyChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string (or just press Enter to test empty, or type 'null' to simulate null):");


        String userInput = input.nextLine();
        if(userInput.equals("null")) {
            userInput = null;
        }

        if (userInput == null) {
            System.out.println("The string is null.");
        } else if(userInput.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is neither null nor empty.");
            System.out.println("String length: " + userInput.length());
        }
        input.close();

    }
}
