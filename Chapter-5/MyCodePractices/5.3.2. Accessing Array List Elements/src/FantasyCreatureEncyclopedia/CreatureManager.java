package FantasyCreatureEncyclopedia;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreatureManager {
    private static final ArrayList<Creature> creatureList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("\n🧙 Fantasy Creature Encyclopedia");
            System.out.println("1. Add Creature");
            System.out.println("2. Modify Creature");
            System.out.println("3. Remove Creature");
            System.out.println("4. List All Creatures");
            System.out.println("5. Convert to Array and Show");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt(); scanner.nextLine();

            switch (choice){
                case 1 -> CreateCreature();
                case 2 -> modifyCreature();
                case 3 -> removeCreature();
                case 4 -> listCreatures();
                case 5 -> showAsArray();
                case 6 -> {
                    System.out.println("👋 Goodbye!");
                    running = false;
                }
                default -> System.out.println("❌ Invalid option.");
            }
        }
    }

    static void CreateCreature(){
        System.out.println("Enter creature name: ");
        String name = scanner.nextLine();
        System.out.println("Enter creature type (e.g. Dragon, Elf): ");
        String type = scanner.nextLine();

        ArrayList<String> abilities = new ArrayList<>();
        System.out.println("Enter abilities (type 'done' to finish):");
        while(true){
            String ability = scanner.nextLine();
            if (ability.equalsIgnoreCase("done")) break;
            abilities.add(ability);
        }
        Creature newCreature = new Creature(name,type,abilities);
        creatureList.add(newCreature);
        System.out.println("✅ Creature added!");
    }

    static void modifyCreature(){
        listCreatures();
        System.out.println("Choose creature index to modify: ");
        int index = scanner.nextInt();scanner.nextLine();
        if (index < 0 || index >= creatureList.size()){
            System.out.println("❌ Invalid index.");
            return;
        }
        Creature c = creatureList.get(index);
        System.out.println("New name(" + c.getName()+ "): ");
        String name = scanner.nextLine();
        System.out.println("New type (" + c.getType() + "): ");
        String type = scanner.nextLine();

        ArrayList<String> newAbilities = new ArrayList<>();
        System.out.println("New abilities (type 'done' to finish):");

        while(true){
            String ab = scanner.nextLine();
            if (ab.equalsIgnoreCase("Done")) break;
            newAbilities.add(ab);
        }
        //use set
        Creature updated = new Creature(name, type,newAbilities);
        creatureList.set(index,updated);
        System.out.println("🔄 Creature updated!");
    }
    //remove creature
    static void removeCreature(){
        listCreatures();
        System.out.println("Choose creature index to remove: ");
        int index = scanner.nextInt(); scanner.nextLine();
        if ((index < 0|| index >= creatureList.size())){
            System.out.println("❌ Invalid index.");
            return;
            //It means: “stop the current method and go back, without returning any value.”
        }
        creatureList.remove(index);
        System.out.println("🗑️ Creature removed.");
    }

    //list creatures
    static void listCreatures(){
        if (creatureList.isEmpty()){
            System.out.println("⚠️ No creatures.");
            return;
        }
        for (int i =0; i<creatureList.size(); i++){
            System.out.println(i + ". " +creatureList.get(i));
        }
    }
    //convert to array
    static void showAsArray(){
        Creature[] array = creatureList.toArray(new Creature[0]);
        //The 0 means: "I'm not providing a real array, just a placeholder of the right type."
        System.out.println("📦 Creatures as array:");
        System.out.println(Arrays.toString(array));
    }

}
