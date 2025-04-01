package AiPoweredFitnessCoach;

import javax.imageio.stream.ImageInputStreamImpl;
import java.util.Scanner;

public class FitnessCoachApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coach myCoach;
        System.out.println("Choose your coach: (1) Basic Coach (2) AI Coach");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            myCoach = new Coach();
        } else {
            myCoach = new AICoach();
        }

        // User chooses workout type
        System.out.println("Choose workout type: (1) Default (2) Custom (duration) (3) Custom (intensity)");
        int workoutChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (workoutChoice) {
            case 1:
                myCoach.suggestWorkout();
                break;
            case 2:
                System.out.println("Enter workout duration (minutes):");
                int duration = scanner.nextInt();
                myCoach.suggestWorkout(duration);
                break;
            case 3:
                System.out.println("Enter intensity (low, medium, high):");
                String intensity = scanner.nextLine();
                myCoach.suggestWorkout(intensity);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }

}
