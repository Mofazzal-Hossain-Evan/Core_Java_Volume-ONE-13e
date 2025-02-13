import java.time.LocalDate;
import java.util.Scanner;

public class ThousandDaysChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start date (YYYY-MM-DD): ");
        LocalDate statDate = LocalDate.parse(scanner.nextLine());

        LocalDate futureDate = statDate.plusDays(1000);
        System.out.println("The date 1000 days later is: " + futureDate + " (" + futureDate.getDayOfWeek() + ")");
scanner.close();
    }
}
