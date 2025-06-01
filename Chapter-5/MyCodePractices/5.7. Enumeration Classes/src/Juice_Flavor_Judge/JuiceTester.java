package Juice_Flavor_Judge;

import java.util.Scanner;

public class JuiceTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite juice flavor (MANGO, ORANGE, LITCHI, BITTER_GOURD): ");
        String input = scanner.next().toLowerCase();

        JuiceFlavor flavor = JuiceFlavor.valueOf(JuiceFlavor.class, input);
        System.out.println("Judgment: " + flavor.getJudgement());

    }
}
