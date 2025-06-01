package WeatherDataLogger;

import java.util.Date;

public class WeatherData {
    private double temperature;
    private  double humidity;
    private double windSpeed;
    private Date timestamp;


    public WeatherData(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.timestamp = new Date();
    }


    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "WheatherData {" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", timestamp=" + timestamp +
                '}';
    }


}
