package WarSimulatio;

import java.util.ArrayList;
import java.util.List;

public class WarGame{
    public static void main(String[] args) {
        List<Battle> battles = new ArrayList<>();
        battles.add(new Battle("Spartans", "Persians", 500, 300, ""));
        battles.add(new Battle("Romans", "Gauls", 700, 800, ""));
        battles.add(new Battle("Vikings", "Saxons", 600, 600, ""));

        System.out.println("Welcome to the War Simulation Game!");
        System.out.println("-------------------------------------");
        
        for (Battle battle : battles) {
            battle.displayBattle();
        }
    }
}
