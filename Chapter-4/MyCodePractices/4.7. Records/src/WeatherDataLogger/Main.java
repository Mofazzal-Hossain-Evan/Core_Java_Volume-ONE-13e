package WeatherDataLogger;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        WeatherLogger logger = new WeatherLogger();

        // Log some data
        logger.logData(22, 55, 10);
        logger.logData(25, 60, 12);

        // Query by date (example)
        Date startDate = new Date(); // current date
        Date endDate = new Date(); // current date

        System.out.println("Weather records between given dates:");
        for (WeatherData data : logger.queryByDate(startDate, endDate)) {
            System.out.println(data);
        }

        // Query by temperature range
        System.out.println("Weather records in temperature range:");
        for (WeatherData data : logger.queryByTemperatureRange(20,34)){
            System.out.println(data);
        }
    }
}
