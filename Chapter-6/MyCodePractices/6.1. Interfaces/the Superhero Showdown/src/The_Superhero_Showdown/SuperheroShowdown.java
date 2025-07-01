package The_Superhero_Showdown;

import java.util.Arrays;
import java.util.Scanner;

public class SuperheroShowdown {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize array of superheroes
        Superhero[] superheroes = {
                new Superhero("Superman", 95, 80.5, "Justice League"),
                new Superhero("Wonder Woman", 85, 70.0, "Justice League"),
                new Superhero("Flash", 70, 95.0, "Justice League"),
                new Superhero("Batman", 70, 60.0, "Justice League") // Same power as Flash for tie-breaking test
        };

        // Main program loop
        while (true) {
            // Display menu
            System.out.println("\nSuperhero Roster:");
            System.out.println("1. Sort by Power Level");
            System.out.println("2. Sort by Speed");
            System.out.println("3. Sort by Name");
            System.out.println("4. Add new superhero");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            // Get user choice
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            // Handle user choice
            switch (choice) {
                case 1:
                    // Sort by power level (natural ordering)
                    Arrays.sort(superheroes);
                    System.out.println("\nSorted by Power Level:");
                    printSuperheroes(superheroes);
                    break;
                case 2:
                    // Sort by speed using SpeedComparator
                    Arrays.sort(superheroes, new SpeedComparator());
                    System.out.println("\nSorted by Speed:");
                    printSuperheroes(superheroes);
                    break;
                case 3:
                    // Sort by name using NameComparator
                    Arrays.sort(superheroes, new NameComparator());
                    System.out.println("\nSorted by Name:");
                    printSuperheroes(superheroes);
                    break;
                case 4:
                    // Add new superhero
                    superheroes = addSuperhero(superheroes, scanner);
                    System.out.println("\nCurrent Roster:");
                    printSuperheroes(superheroes);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
        // Close scanner
        scanner.close();
    }

    // Method to print superhero array
    private static void printSuperheroes(Superhero[] superheroes) {
        for (Superhero hero : superheroes) {
            System.out.println(hero);
        }
    }

    // Method to add a new superhero to the array
    private static Superhero[] addSuperhero(Superhero[] superheroes, Scanner scanner) {
        // Prompt for superhero details
        System.out.print("Enter superhero name: ");
        String name = scanner.nextLine();

        // Get power level with validation
        int powerLevel;
        while (true) {
            System.out.print("Enter power level (non-negative integer): ");
            try {
                powerLevel = Integer.parseInt(scanner.nextLine());
                if (powerLevel >= 0) break;
                System.out.println("Power level must be non-negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // Get speed with validation
        double speed;
        while (true) {
            System.out.print("Enter speed (non-negative number): ");
            try {
                speed = Double.parseDouble(scanner.nextLine());
                if (speed >= 0) break;
                System.out.println("Speed must be non-negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // Get team
        System.out.print("Enter team: ");
        String team = scanner.nextLine();

        // Create new array with one additional slot
        Superhero[] newHeroes = new Superhero[superheroes.length + 1];
        // Copy existing superheroes
        System.arraycopy(superheroes, 0, newHeroes, 0, superheroes.length);
        // Add new superhero
        newHeroes[newHeroes.length - 1] = new Superhero(name, powerLevel, speed, team);
        return newHeroes;
    }
}