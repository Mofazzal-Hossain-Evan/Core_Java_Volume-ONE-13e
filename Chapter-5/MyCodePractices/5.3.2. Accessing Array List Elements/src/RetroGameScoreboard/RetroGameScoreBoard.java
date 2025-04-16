package RetroGameScoreboard;

import java.util.ArrayList;
import java.util.Scanner;

public class RetroGameScoreBoard {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<GameScore> leaderboard = new ArrayList<>();

        //initial scores
        leaderboard.add(new GameScore("Alice", 3, 1500, "02:30"));
        leaderboard.add(new GameScore("Bob", 5, 2300, "03:10"));
        leaderboard.add(new GameScore("Charlie", 2, 800, "01:45"));

        System.out.println("🏆 Initial Leaderboard:");
        printLeaderboard(leaderboard);

        //insert new score
        System.out.println("\n➕ Inserting new player at index 1...");
        leaderboard.add(1, new GameScore("Diana", 4, 1900, "02:50"));
        printLeaderboard(leaderboard);

        // search by player's name
        System.out.println("\n🔍 Enter a player's name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (GameScore g : leaderboard){
            if (g.getPlayerName().equalsIgnoreCase(searchName)){
                System.out.println("✅ Player Found: " + g);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("❌ Player not found.");
            scanner.close();
        }

    }
    public static void printLeaderboard(ArrayList<GameScore> list){
        for (GameScore g : list){
            System.out.println(g);
        }
    }
}