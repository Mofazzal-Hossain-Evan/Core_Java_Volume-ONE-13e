import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString = "Hello";
        System.out.println("Welcome to the Interactive String Manipulator!");
        System.out.println("You start with the string: " + userString);
        System.out.println("Note: Strings in Java are immutable. Modifications create new strings.");

        while(true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Replace part of the string");
            System.out.println("2. Concatenate another string");
            System.out.println("3. Extract a substring");
            System.out.println("4. View the current string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = input.nextInt();
            input.nextLine(); // Consume the newline

            /***
             This code snippet demonstrates how input handling works in Java when using a Scanner object,
             particularly when reading mixed types of input (e.g., integers and strings).

             Explanation:
             int choice = input.nextInt();

             This line reads an integer value from the user.
             The nextInt() method only reads the integer part from the input but leaves the newline character (\n)
             in the input buffer.
             input.nextLine(); // Consume the newline

             After reading the integer, the newline character remains in the buffer.
             This can cause issues if the next input operation expects a string (or a line).
             The nextLine() method is used to consume this leftover newline character and clear the input buffer,
             ensuring that subsequent nextLine() calls work as expected.
             Why This Is Necessary:
             When you use nextInt() to read an integer, it stops reading at the first
             non-numeric character (typically the newline character after the user presses Enter).
             If you then call nextLine() without clearing the buffer,
             it will immediately read the leftover newline and return an empty string, causing unexpected behavior.
            ***/

            switch (choice) {
                case 1:
                    System.out.print("Enter the part of the string to replace: ");
                    String target = input.nextLine();
                    System.out.println("Enter the new text: ");
                    String replacement = input.nextLine();
                    if(userString.contains(target)) {
                        userString = userString.replace(target, replacement);
                        System.out.println("Updated string: " + userString);
                    } else {
                        System.out.println("The text \"" + target + "\" was not found in the string.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the string to concatenate: ");
                    String  toConcatenate = input.next();
                    userString = userString + toConcatenate;
                    System.out.println("Updated string: " + userString);
                    break;

                case 3:
                    System.out.println("The string length is: " + userString.length());
                    System.out.print("Enter the starting index (0-based): ");
                    int startIndex = input.nextInt();
                    System.out.print("Enter the ending index (exclusive): ");
                    int endIndex = input.nextInt();
                    if(startIndex >= 0 && endIndex <= userString.length() && startIndex < endIndex){
                        String substring = userString.substring(startIndex, endIndex);
                        System.out.println("Extracted substring: " + substring);
                    } else {
                        System.out.println("Invalid indices. Please try again.");
                    }
                    break;

                case 4:
                    System.out.println("Current string: " + userString);
                    break;

                case 5:
                    System.out.println("Exiting the String Manipulator. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
