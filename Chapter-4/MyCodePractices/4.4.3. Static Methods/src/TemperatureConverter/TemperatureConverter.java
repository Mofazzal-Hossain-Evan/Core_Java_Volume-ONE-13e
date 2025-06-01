package TemperatureConverter;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double cel){
        return (cel * 9 /5) + 32;
    }

    public static double fahrenheitToCelsius(double fah){
        return (fah - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        System.out.println("20°C to Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(34));
        System.out.println("68°F to Celsius: " + TemperatureConverter.fahrenheitToCelsius(44));
    }
}
