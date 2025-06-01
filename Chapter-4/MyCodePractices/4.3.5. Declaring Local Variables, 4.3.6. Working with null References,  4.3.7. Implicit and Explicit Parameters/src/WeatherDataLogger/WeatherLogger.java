package WeatherDataLogger;

import java.util.HashMap;
import java.util.Objects;

public class WeatherLogger {
    public static void main(String[] args) {
        var weatherData = new HashMap<String, Double>();

        weatherData.put("Monday", 25.5);
        weatherData.put("Tuesday", null);  // Simulating missing data
        weatherData.put("Wednesday", 30.0);

        System.out.println("Weather Report:");

        for (var entry : weatherData.entrySet()){
            var temp = Objects.requireNonNullElse(entry.getValue(), 0.0);
            System.out.println(entry.getKey()+": "+ temp + "°C");
        }

    }
}
