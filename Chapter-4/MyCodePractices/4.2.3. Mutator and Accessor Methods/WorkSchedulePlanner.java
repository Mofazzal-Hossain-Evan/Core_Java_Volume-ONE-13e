import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WorkSchedulePlanner {
    private static Set<LocalDate> workDays = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Work Day\n2. Remove Work Day\n3. View Work Schedule\n4. Count Work Days\n5. Exit");
            System.out.print("Chose an option");
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    System.out.println("Enter work date (YYYY-MM-DD): ");
                    workDays.add(LocalDate.parse(scanner.nextLine()));
                    System.out.println("Work day added!");
                    break;

                case 2:
                    System.out.println("Date to remove");
                    workDays.add(LocalDate.parse(scanner.nextLine()));
                    System.out.println("added");
                    break;

                case 3:
                    System.out.println("Work Schedule: ");
                    for (LocalDate date : workDays)
                        System.out.println(date);
                    break;
                case 4:
                    System.out.println("Total workdays: " + workDays.size());
                    break;

                case 5:
                    System.out.println("Exiting..");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalid");
            }

        }

    }
}
