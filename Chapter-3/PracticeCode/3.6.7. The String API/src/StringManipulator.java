import java.util.Locale;
import java.util.Scanner;

public class StringManipulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the String Manipulator Tool!");
        System.out.println("Enter a string: ");

        String userInput = input.nextLine();
        // 1. Length of the string
        System.out.println("Length of the string: " + userInput.length());

        System.out.println("Is the string empty? " + userInput.isEmpty());
        System.out.println("Is the string blank? " + userInput.isBlank());

        // 3. Convert case
        System.out.println("Lowercase: " + userInput.toLowerCase());
        System.out.println("Uppercase: " + userInput.toUpperCase());

        // 4. Trim spaces
        System.out.println("Trimmed string: '" + userInput.strip() + "'");

        System.out.println("Enter start index for substring: ");
        int startIndex = input.nextInt();
        input.nextLine(); // Consume the newline
        if(startIndex >= 0 && startIndex < userInput.length() ) {
            System.out.println("Substring from " +startIndex + ": " + userInput.substring(startIndex));
            /*** How it Works:
            startIndex: This integer specifies the starting position in the string from which the extraction begins.
            The index is zero-based, meaning that the first character of the string is at index 0.
            Example: If the string userInput is "Hello, World!" and startIndex is 7, the result of userInput.substring(7) will be "World!". ***/

        } else  {
            System.out.println("Invalid start index.");
        }


        // 6. Replace substrings
        System.out.println("Enter the substring to replace: ");
        String target = input.nextLine();
        System.out.println("Enter the replacement string: ");
        String replacement = input.nextLine();
        System.out.println("Modified string: " + userInput.replace(target, replacement));

        // 7. Check start and end of string
        System.out.println("Enter a prefix to check: ");
        String prefix = input.nextLine();
        System.out.println("Does the string start with '" + prefix + "'? " + userInput.startsWith(prefix));

        System.out.println("Enter a suffix to check: ");
        String suffix = input.nextLine();
        System.out.println("Does the string end with '" + suffix + "'? " + userInput.endsWith(suffix));

        // 8. Find index of substring
        System.out.println("Enter a substring to find: ");
        String substring = input.nextLine();
        int firstIndex = userInput.indexOf(substring);
        int lastIndex = userInput.lastIndexOf(substring);
        System.out.println("First occurrence: " + (firstIndex != -1 ? firstIndex : "Not found"));
        /**
         *
         The selected code snippet `(firstIndex != -1 ? firstIndex : "Not found")` is part of a ternary operation,
         a concise way to write a conditional expression in Java. Here's what it does:

         1. **Purpose**: This expression is used to determine whether the substring being searched for exists in the `userInput` string.

         2. **Logic**:
         - `firstIndex` holds the result of `userInput.indexOf(substring)`, which gives the position of the first occurrence of `substring` in `userInput`.
         If `substring` is not found, `indexOf` returns `-1`.
         - The ternary operator `? :` checks if `firstIndex` is not equal to `-1`.
         - If true, it returns the value of `firstIndex` (the index where the substring starts).
         - If false, it returns the string `"Not found"`.

         3. **Example**:
         - If `userInput` is `"hello world"` and `substring` is `"world"`, `firstIndex` will be `6`. The output will be `6`.
         - If `substring` is `"java"`, `firstIndex` will be `-1`, and the output will be `"Not found"`.

         This construct ensures that you provide a clear output whether or not the substring exists, avoiding raw `-1` in the user-facing result.
         **/

        System.out.println("Last occurrence: " + (lastIndex != -1 ? lastIndex : "Not found"));

// 9. Repeat the string
        System.out.println("Enter the number of times to repeat the string: ");
        int repeatCount = input.nextInt();
        input.nextLine();

        if (repeatCount > 0 ) {
            System.out.println("Repeated string: " + userInput.repeat(repeatCount));
        } else {
            System.out.println("Repeat count must be positive.");
        }
// 10. Split and join strings
        System.out.println("Enter a delimiter to split the string: ");
        String delimiter = input.nextLine();
        String[] parts = userInput.split(delimiter);//সীমানা

        /**
         Example:
         Suppose the user provides the following:

         userInput = "Java-Python-C++"
         delimiter = "-"
         The split(delimiter) method will break the string at every -, resulting in
         */

        System.out.println("Splitted parts: ");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("Join the parts with '-': " + String.join("-", parts));

        // 11. Check equality
        System.out.println("Enter another string to compare: ");
        String compareString = input.nextLine();
        System.out.println("Are the strings equal? " + userInput.equals(compareString));
        System.out.println("Are the strings equal (ignore case)? " + userInput.equalsIgnoreCase(compareString));

        // Farewell message
        System.out.println("Thank you for using the String Manipulator Tool!");
        input.close();

    }
}
