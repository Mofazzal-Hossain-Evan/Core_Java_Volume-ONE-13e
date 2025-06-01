package Coffee_Strength;

import java.util.Scanner;

public class CoffeeMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your coffee strength (DECAF, MILD, STRONG, ESPRESSO_SHOT): ");
        String input = scanner.next().toUpperCase();

        CoffeeStrength strength = CoffeeStrength.valueOf(CoffeeStrength.class, input);

        System.out.println("Programmer's mood: " + strength.getMood());
    }
}
