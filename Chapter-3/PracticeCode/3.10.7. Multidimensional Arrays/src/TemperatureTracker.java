import java.util.Random;

public class TemperatureTracker {
    public static void main(String[] args) {


        int year = 5;
        int months = 12;
        double[][] temperatures = new double[year][months];
        Random random = new Random();

        //opulate array
        for (int i = 0; i < year; i++) {
            for (int j = 0; j< months; j++) {
                temperatures[i][j] = 15 + random.nextDouble() * 20;
            }
        }

        double highestAverage = 0;
        int hottestYear = 0;

        // Calculate
        for (int i = 0; i < year; i++){
            double sum = 0;
            for (int j = 0; j < months; j++) {
                sum += temperatures[i][j];
            }
            double average = sum / months;
            System.out.printf("Year %d average temperature: %.2f°C%n", i + 1, average);

            if(average > highestAverage) {
                highestAverage = average;
                hottestYear = i + 1;
            }
        }
        System.out.printf("Hottest year: Year %d with an average of %.2f°C%n", hottestYear, highestAverage);


    }
}
