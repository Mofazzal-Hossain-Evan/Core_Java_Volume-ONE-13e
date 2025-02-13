import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateComparison {
    public static void main(String[] args) {

        LocalDate localdate = LocalDate.of(2025, 1, 7);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2025, Calendar.JANUARY,7);

        // Using LocalDate (Immutable)
        LocalDate newLocalDate = localdate.plusDays(100);
        System.out.println("LocalDate after 1000 days: " + newLocalDate);

        // Using GregorianCalendar (Mutable)
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1000);
        int newYear = gregorianCalendar.get(Calendar.YEAR);
        int newMonth = gregorianCalendar.get(Calendar.MONTH);
        int newDay    = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("GregorianCalendar after 1000 days: " + newYear + "-" + newMonth + "-" + newDay);

    }
}
