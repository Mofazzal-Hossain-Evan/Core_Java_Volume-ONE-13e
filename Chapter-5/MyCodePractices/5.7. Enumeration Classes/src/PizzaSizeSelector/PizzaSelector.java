package PizzaSizeSelector;

import java.util.Scanner;

public class PizzaSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🍕 Welcome to Pizza Size Selector!");
        System.out.println("Available sizes: ");

        for (PizzaSize size : PizzaSize.values()){
            System.out.println(" _ " + size.name());
        }

        System.out.print("\nEnter your pizza size choice: ");
        String input = scanner.next().toUpperCase();

        try{
            PizzaSize selected = PizzaSize.valueOf(PizzaSize.class, input);
            System.out.println("\n✅ You selected: "  + selected);
            System.out.println("👉 Description: " + selected.getDescription());
            System.out.println("💰 Price: $" + selected.getPrice());
            System.out.println("🔥 Calories: " + selected.getCalories());

            System.out.println("🧠 Adventure Level: "  + selected.ordinal() + "/4");
            if (selected.ordinal() == 4){
                System.out.println("⚠️ Warning: Prepare for pizza coma!");
            }
        } catch (IllegalArgumentException f){
            System.out.println("❌ Invalid size entered! Please try again with a valid size.");
        }
    }
}
