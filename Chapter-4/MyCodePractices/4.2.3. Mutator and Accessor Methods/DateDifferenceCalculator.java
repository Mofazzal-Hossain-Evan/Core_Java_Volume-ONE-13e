import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        long monthsBetween = ChronoUnit.MONTHS.between(date1, date2);
        long yearsBetween = ChronoUnit.YEARS.between(date1, date2);

        System.out.println("Difference: " + yearsBetween + " years, " + monthsBetween + " months, " + daysBetween + " days.");
        scanner.close();
    }
}
