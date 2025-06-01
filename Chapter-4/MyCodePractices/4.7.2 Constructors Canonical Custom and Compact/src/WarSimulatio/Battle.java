package WarSimulatio;

import java.util.ArrayList;
import java.util.List;

public record Battle(String army1, String army2, int strength1, int strength2, String winner) {
    public Battle {
        if (strength1 < 0 || strength2 < 0) {
            throw new IllegalArgumentException("cANT BE NEGATIVE");
        }
        winner = determineWinner(strength1, strength2);
    }

    // Determines the winner based on strength
    private static String determineWinner(int s1, int s2) {
        if (s1 > s2) return "Winner: Army 1";
        else if (s1 < s2) return "Winner: Army 2";
        else return "It is Draw";
    }

    public void displayBattle() {
        System.out.println("\nBattle Between: " + army1 + " vs " + army2);
        System.out.println(army1 + " Strength: " + strength1);
        System.out.println(army2 + " Strength: " + strength2);
        System.out.println("Result: " + winner + "\n");
    }


}

