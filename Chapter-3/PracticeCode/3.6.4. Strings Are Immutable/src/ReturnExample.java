import java.util.Scanner;

public class ReturnExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Choose an option:");
            System.out.println("1. Say Hello");
            System.out.println("2. Exit");

            int choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Hello, world!");
                    break;

                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
