import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Multi-Option Menu!");
        System.out.println("Please select an option:");
        System.out.println("1. Display a Greeting");
        System.out.println("2. Perform Addition");
        System.out.println("3. Display Current Month");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Hello, user! Have a great day!");
            }
            case  2 -> {
                System.out.println("Enter two numbers to add:");
                int num1 = scanner.nextInt();
                int num2= scanner.nextInt();
                System.out.println("The sum is: "+(num1 + num2));
            }
            case 3 -> {
                String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                int currentMonth = java.time.LocalDate.now().getMonthValue();
                System.out.println("The current month is: " + month[currentMonth - 1]);
            }
                case 4 -> {
                    System.out.println("Exiting the program. Goodbye!");
                }
                default -> {
                    System.out.println("Invalid choice. Please run the program again.");
                }
        }
        scanner.close();
    }
}
