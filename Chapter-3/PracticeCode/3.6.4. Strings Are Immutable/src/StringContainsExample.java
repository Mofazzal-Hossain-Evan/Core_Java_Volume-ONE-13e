import java.util.Scanner;

public class StringContainsExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = input.next();

        System.out.println("Enter a substring to search: ");
        String target = input.nextLine();

        if(userString.contains(target)) {
            System.out.println("The string contains the substring: " + target);
        } else {
            System.out.println("The string does not contain the substring: " + target);

        }

        input.close();
    }
}
