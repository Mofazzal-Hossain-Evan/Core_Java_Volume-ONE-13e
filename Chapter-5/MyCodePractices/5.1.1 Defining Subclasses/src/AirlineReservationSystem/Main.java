package AirlineReservationSystem;

public class Main {
    public static void main(String[] args) {

        EconomyPassenger ecoPassenger = new EconomyPassenger("Alice", "A12345", 20, "Vegetarian");
        BusinessPassenger bizPassenger = new BusinessPassenger("Bob", "B67890", true, 10);
        FirstClassPassenger firstPassenger = new FirstClassPassenger("Charlie", "C54321", true, true);

        // Display passenger details
        System.out.println("---- Economy Passenger ----");
        ecoPassenger.displayInfo();

        System.out.println("\n---- Business Passenger ----");
        bizPassenger.displayInfo();

        System.out.println("\n---- First Class Passenger ----");
        firstPassenger.displayInfo();
    }
}
