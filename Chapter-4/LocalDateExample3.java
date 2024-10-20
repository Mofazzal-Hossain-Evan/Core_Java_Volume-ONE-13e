import java.time.LocalDate;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate chrismas = LocalDate.of(2024, 12, 25);


        int year = chrismas.getYear();
        int month = chrismas.getMonthValue();
        int day = chrismas.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);

        // Example 4: Adding days to a LocalDate and retrieving the new date
        LocalDate aWeekLater = chrismas.plusDays(7);
        System.out.println("A week after Christmas 2024: " + aWeekLater);

    }

}
