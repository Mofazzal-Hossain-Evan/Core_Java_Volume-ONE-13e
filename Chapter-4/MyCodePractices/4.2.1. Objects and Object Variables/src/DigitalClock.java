import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");

        while (true) {
            Date now = new Date(); // Create new Date object (Current Time)
            System.out.println(formatter.format(now)); // Format & print time
            Thread.sleep(1000); // Wait 1 second before updating
        }
    }
}
