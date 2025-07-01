package Galactic_Spaceship;

import java.util.*;

public class FleetManager {

    private static final double MISSION_DISTANCE = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Spaceship> fleet = new ArrayList<>(Arrays.asList(
                new Spaceship("Enterprise", 10.5, 500, "Exploration"),
                new Spaceship("Falcon", 6.5, 700, "Cargo"),
                new Spaceship("Voyager", 8.0, 300, "Exploration")
        ));

        while (true){
            System.out.println("\nFleet Management System:");
            System.out.println("1. Sort by Fuel Efficiency");
            System.out.println("2. Sort by Cargo Capacity");
            System.out.println("3. Add New Ship");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                // Comparable অনুযায়ী sort
                Collections.sort(fleet);
                System.out.println("Sorted by Fuel Efficiency:");
                displayFleet(fleet);     // সব স্পেসশিপ প্রিন্ট করবে
                simulateMission(fleet);  // fuel usage হিসাব করবে
                break;
                case 2:
                    // Comparator অনুযায়ী sort
                    fleet.sort(new CargoComparator());
                    System.out.println("Sorted by Cargo Capacity:");
                    displayFleet(fleet);
                    simulateMission(fleet);
                    break;
                case 3:
                    // নতুন spaceship যোগ করার জন্য
                    addNewShip(fleet, scanner);
                    break;
                case 4:
                    // প্রোগ্রাম থেকে বের হবার অপশন
                    System.out.println("Exiting...");
                    return;
                default:
                    // যদি ভুল ইনপুট দেয়
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static void addNewShip(List<Spaceship> fleet, Scanner scanner){
        System.out.print("Enter Ship Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Fuel Efficiency (km/L): ");
        double efficiency = scanner.nextDouble();

        System.out.print("Enter Cargo Capacity (tons): ");
        int cargo = scanner.nextInt();
        scanner.nextLine();  // newline consume

        System.out.print("Enter Mission Type: ");
        String mission = scanner.nextLine();

        try{
            Spaceship newShip = new Spaceship(name, efficiency, cargo, mission);
            fleet.add(newShip);
            System.out.println("Ship added successfully!");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());  // invalid value দিলে error

        }
    }

    private static void displayFleet(List<Spaceship> fleet){
        for (Spaceship ship : fleet){
            System.out.println(ship);
        }
    }
    private static void simulateMission(List<Spaceship> fleet){
        double totalFuel = 0;
        for (Spaceship ship : fleet){
            double fuelUsed = MISSION_DISTANCE / ship.getFuelEfficiency(); // formula: distance ÷ efficiency
            totalFuel += fuelUsed;
            System.out.printf("Top ship %s will carry %d tons using %.2f liters of fuel%n", ship.getShipName(),
                    ship.getCargoCapacity(), fuelUsed);
        }
        System.out.printf("Total Mission Fuel Usage (%.0f km): %.2f liters%n", MISSION_DISTANCE, totalFuel);
    }

}
