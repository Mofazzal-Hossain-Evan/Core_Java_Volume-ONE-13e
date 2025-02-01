import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {

        SimpleDateFormat formatter = new SimpleDateFormat(" hh:mm:ss a");

        while(true) {
            Date now = new Date();
            System.out.println(formatter.format(now));
            Thread.sleep(100);
        }
    }
}
