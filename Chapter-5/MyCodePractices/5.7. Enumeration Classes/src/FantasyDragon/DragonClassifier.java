package FantasyDragon;

import java.util.Scanner;

public class DragonClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your dragon type (FIRE, ICE, LIGHTNING, EMOTIONAL");
        String input = scanner.next().toUpperCase();
        DragonType dragon = DragonType.valueOf(DragonType.class, input);

        System.out.println("Dragon's ability: " + dragon.getAbility());
        System.out.println("Power level (based on ordinal): " + (dragon.ordinal()+1) * 100);

    }
}
