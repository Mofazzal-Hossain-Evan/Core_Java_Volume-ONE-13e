package RideBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record Ride(String pickup, String destination, double distance, double fare, String driver) {

    // compect

    public Ride {

        if (distance < 0) {
            throw new IllegalArgumentException("it cant be zero");
        }
        fare = calculateFare(distance);
        driver = assignDriver();
    }

    // Method to calculate fare based on distance
    private static double calculateFare(double distance) {
        return +(distance * 10); // base 50 , per km 10
    }

    // Method to randomly assign a driver
    private static String assignDriver() {
        String[] drivers = {"Rahim", "Karim", "Jamal", "Asif", "Sakib"};
        return drivers[new Random().nextInt(drivers.length)];
    }

    public void displayRide() {
        System.out.println("\nRide Details:");
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + fare + " BDT");
        System.out.println("Assigned Driver: " + driver + "\n");
    }
}

class RideBookingApp {
    public static void main(String[] args) {
        List<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Dhanmondi", "Gulshan", 10.5, 0, ""));
        rides.add(new Ride("Banani", "Uttara", 15.2, 0, ""));
        rides.add(new Ride("Mirpur", "Motijheel", 20.0, 0, ""));

        System.out.println("Welcome to the Enhanced Ride Booking System!");
        System.out.println("--------------------------------------------------");


        for (Ride ride : rides) {
            ride.displayRide();
        }
    }
}
