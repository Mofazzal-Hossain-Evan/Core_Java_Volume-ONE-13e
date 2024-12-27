import java.util.Locale;
import java.util.Scanner;

public class SeasonFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProgrm = true;

        System.out.println("Welcome to the Season Finder!");

        while (continueProgrm) {
        System.out.print("\nEnter a season code (0: Spring, 1: Summer, 2: Fall, 3: Winter): ");
        int seasonCode = input.nextInt();

        String seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "Unknown season";

        };

        System.out.println("The season is: " + seasonName);

        System.out.println("Do you want to try another code? (yes/no): ");
        String Responce = input.next().toLowerCase();
        continueProgrm = Responce.equals("yes");
        }
        System.out.println("\nThank you for using the Season Finder! Goodbye!");
        input.close();

    }
}
