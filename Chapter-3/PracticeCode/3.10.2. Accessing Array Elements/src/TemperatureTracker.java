import java.util.Random;

public class TemperatureTracker {

    public static void main(String[] args) {

        int[] tem  = new int[30];
        Random random = new Random();

        for (int i = 0; i < tem.length; i++) {
            tem[i] = random.nextInt(41);
        }

        int sum = 0, max = tem[0], min = tem[0];
        for(int temp2 : tem) {
            sum += temp2;
            if(temp2 > max) max = temp2;
            if (temp2 < min) min = temp2;
        }
        System.out.println("Average: " + (sum / tem.length));
        System.out.println("Max Temp: " + max);
        System.out.println("Min Temp: " + min);

    }
}
