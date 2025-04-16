package ArcadeTokenManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ArcadeManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<PlayerTokenUsage> usageList = new ArrayList<>();

        boolean running = true;
        while(running){
            System.out.println("\n🕹️ Arcade Token Manager");
            System.out.println("1. Add Token Usage");
            System.out.println("2. Remove Token Usage");
            System.out.println("3. Update Tokens Used");
            System.out.println("4. View Usage by Player");
            System.out.println("5. Exit");
            System.out.print("Select: ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice){
                case 1 -> {
                    System.out.print("Player Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Game Name: ");
                    String game = scanner.nextLine();
                    System.out.print("Tokens Used: ");
                    int tokens = scanner.nextInt(); scanner.nextLine();
                    usageList.add(new PlayerTokenUsage(name, game, tokens));
                    System.out.println("✅ Usage added.");
                }
                case 2 -> {
                    System.out.print("Index to remove: ");
                    int index = scanner.nextInt(); scanner.nextLine();
                    if (index >= 0 && index < usageList.size()) {
                        usageList.remove(index);
                        System.out.println("🗑️ Usage removed.");
                    } else {
                        System.out.println("❌ Invalid index.");
                    }
                }
                case 3 -> {
                    System.out.print("Index to update tokens: ");
                    int index = scanner.nextInt(); scanner.nextLine();
                    if (index >= 0 && index < usageList.size()) {
                        System.out.print("New token count: ");
                        int newTokens = scanner.nextInt(); scanner.nextLine();
                        usageList.get(index).setTokensUsed(newTokens);
                        System.out.println("🔄 Tokens updated.");
                    } else {
                        System.out.println("❌ Invalid index.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter player name: ");
                    String search = scanner.nextLine();
                    System.out.println("🎮 Usage by " + search + ":");
                    for (PlayerTokenUsage p : usageList) {
                        if (p.getPlayerName().equalsIgnoreCase(search)) {
                            System.out.println(p);
                        }
                    }
                }
                case 5 -> running = false;
                default -> System.out.println("❗ Invalid option.");
            }
        }
        System.out.println("👋 Bye!");
    }
}
