package StudentScoreManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var scores = new ArrayList<Integer>();

        while(true) {
            System.out.print("Enter a score (or type -1 to stop): ");
            int score = scanner.nextInt();

            if (score == -1) break;

            if (score >= 0 && score <= 100) {
                scores.add(score);
            } else {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        }
        System.out.println("\nStudent Scores: " + scores);
        scanner.close();
    }
}
