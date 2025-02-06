import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayTracker {
    private static Map<String, LocalDate> birthdays = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Birthday\n2. Remove Birthday\n3. View Birthdays\n4. Check Age\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter birthdate (YYYY-MM-DD): ");
                    LocalDate birthdate = LocalDate.parse(scanner.nextLine());
                    birthdays.put(name, birthdate);
                    System.out.println("Birthday added!");
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    birthdays.remove(removeName);
                    System.out.println("Removed successfully.");
                    break;
                case 3:
                    System.out.println("Birthdays List:");
                    for (Map.Entry<String, LocalDate> entry : birthdays.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.print("Enter name to check age: ");
                    String checkName = scanner.nextLine();
                    if (birthdays.containsKey(checkName)) {
                        LocalDate birthDate = birthdays.get(checkName);
                        int age = Period.between(birthDate, LocalDate.now()).getYears();
                        System.out.println(checkName + " is " + age + " years old.");
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
