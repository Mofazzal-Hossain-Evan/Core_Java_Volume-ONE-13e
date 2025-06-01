package VirtualPetSimulator;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class VirtualPet {

    private static final String[] PET_ACTIONS ={
            "wags its tail happily!",
            "jumps around excitedly!",
            "looks at you curiously.",
            "falls asleep peacefully.",
            "runs in circles!"
    };

    private String name;

    public VirtualPet(String name){
        this.name = Objects.requireNonNullElse(name, "Fluffy").trim();
        if (this.name.isEmpty()) this.name = "Fluffy";
    }

    public void interact(){
        var random = new Random();

        System.out.println(name +" "+ PET_ACTIONS[random.nextInt(PET_ACTIONS.length)]);
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Pet name: ");
        var petName = scanner.nextLine();

        var pet = new VirtualPet(petName);
        System.out.println("You have adopted " + pet.name + "!");

        while (true){
            System.out.print("Press Enter to interact or type 'exit' to stop: ");
var input = scanner.nextLine();
if ("exit".equalsIgnoreCase(input)) break;
pet.interact();
        }
        System.out.println(pet.name + " waves goodbye!");
        scanner.close();
    }

}
