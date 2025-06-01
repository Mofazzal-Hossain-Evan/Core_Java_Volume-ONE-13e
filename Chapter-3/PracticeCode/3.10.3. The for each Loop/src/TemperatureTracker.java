import java.util.Arrays;

public class TemperatureTracker {
    
    public static void main(String[] args) {
        
        double[] temperatures = {72.5, 75.0, 68.0, 70.5, 69.0, 74.5, 73.0};
        
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int countAbove72 = 0;
        
        for (double temp : temperatures) {
            total += temp;
            if (temp > max) max = temp;
            if(temp < min) min = temp;
            if (temp > 72) countAbove72++;
        }
        double average = total / temperatures.length;
        
        System.out.println("Temperatures: " + Arrays.toString(temperatures));
        System.out.println("Average Temperature: " + average);
        System.out.println("Highest Temperature: " + max);
        System.out.println("Lowest Temperature: " + min);
        System.out.println("Days above 72°F: " + countAbove72);
        
        
    }
}
