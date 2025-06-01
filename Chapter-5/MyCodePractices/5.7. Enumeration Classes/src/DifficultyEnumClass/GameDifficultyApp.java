package DifficultyEnumClass;

import java.util.Scanner;

import static DifficultyEnumClass.Difficulty.*;

public class GameDifficultyApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("🎮 Welcome to Game Difficulty Adjuster 3000!");
        System.out.println("Available difficulties:");

        for (Difficulty d : Difficulty.values()){
            System.out.println("👉 " + d.name());
        }
        System.out.print("\nEnter your difficulty level: ");
        String input = scanner.next().toUpperCase();

        try{
            Difficulty selected = Difficulty.valueOf(Difficulty.class, input);
            System.out.println("\nYou selected: " + selected); // calls toString()

            System.out.println("🔢 Ordinal position: " + selected.ordinal());

            String quote = switch (selected) {
                case EASY -> "Take it slow, enjoy the ride! 🌈";
                case MEDIUM -> "Hmm, decent choice! 👌";
                case HARD -> "Let's sweat a little. 🔥";
                case NIGHTMARE -> "You must be a masochist... 😵‍💫";
            };
            System.out.println("💬 Motivation: " + quote);

        } catch (IllegalArgumentException e){
            System.out.println("❌ Invalid difficulty! Please try again.");

        }
    }
}
