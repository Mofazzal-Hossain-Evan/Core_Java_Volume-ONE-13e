import java.util.*;
import java.io.*;

public class HighScoreTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Player> leaderBoard = new ArrayList<>();

        while (true) {
            System.out.println("\nHigh Score Tracker");
            System.out.println("1. Add a score");
            System.out.println("2. Display leaderboard");
            System.out.println("3. Save leaderboard to file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Enter player name: ");
                    String name = input.next();
                    System.out.println("Enter score: ");
                    int score = input.nextInt();
                    leaderBoard.add(new Player(name, score));
                    leaderBoard.sort((p1, p2) -> Integer.compare(p2.score, p1.score));
                    break;

                case 2:
                    System.out.println("Leaderboard: ");
                    for(Player player : leaderBoard)  {
                        System.out.println(player.name + ": " + player.score);
                    }

                case 3:
                    System.out.println("Enter the file name to save: ");
                    String fileName = input.next();
                    try (PrintWriter writer = new PrintWriter(new FileOutputStream(fileName))) {
                        for (Player player : leaderBoard) {
                            writer.println(player.name +": "+ player.score);
                        }
                        System.out.println("Leaderboard saved to " + fileName);
                    } catch (IOException e) {
                        System.out.println("Error saving to file: " + e.getMessage());
                    }
                    break;

                case 4:
                System.out.println("Exiting...");
                return;
                default:
                    System.out.println("Invalid choice.");

            }

        }


    }

}

// helper class
class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}