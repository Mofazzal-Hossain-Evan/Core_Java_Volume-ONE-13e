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

                /***
                 * he return statement in the given code is used to terminate the execution of the main method (or the current method) and
                 immediately exit it.
                  Here's what happens in the context of your example:
                 When the user selects option 5 (Case 5):

                 The program displays the message "Exiting the String Manipulator. Goodbye!".
                 The input.close(); statement closes the Scanner object to release any system resources associated with it.

                 The return; statement ends the method execution and exits the program because this code is likely in the main method.
                 Effect of return:

                 It stops further execution of the method (in this case, the main method).
                 After the return statement is executed, no other code in the main method will run, and the program ends.
                 Why Use return?

                 It provides a clean and explicit way to exit the method or program.
                 If the return statement is omitted, the program might continue executing unintended parts of the code (if they exist after the switch statement).
                 */

                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
