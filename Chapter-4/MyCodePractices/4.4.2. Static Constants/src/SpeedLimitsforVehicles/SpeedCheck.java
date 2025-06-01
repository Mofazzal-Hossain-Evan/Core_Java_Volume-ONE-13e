package SpeedLimitsforVehicles;

import java.util.Locale;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (car/bike/truck/bus): ");
        String vehicleType = scanner.next().toLowerCase(Locale.ROOT);

        int speedLimit;
        switch (vehicleType) {
            case "car":
                speedLimit = SpeedLimits.CAR;
                break;

            case "bus":
                speedLimit = SpeedLimits.BUS;
                break;

            case "bike":
                speedLimit = SpeedLimits.BIKE;
                break;

            case "truck":
                speedLimit = SpeedLimits.TRUCK;
                break;

            default:
                System.out.println("Invalid vehicle type!");
                return;

        }
        System.out.println("The speed limit for a " + vehicleType + " is " + speedLimit + " km/h.");
        scanner.close();
    }
}
