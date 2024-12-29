import java.util.Scanner;

public class ReplaceSubstringExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        // User input for the target substring
        System.out.print("Enter the substring to replace: ");
        String target = input.nextLine();

        // User input for the replacement substring
        System.out.print("Enter the replacement substring: ");
        String replacement = input.nextLine();

        userString = userString.replace(target, replacement);

        System.out.println("Modified string: " + userString);

        input.close();
    }
}
