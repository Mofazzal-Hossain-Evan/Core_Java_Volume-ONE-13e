package SpaceMissionControlSystem;

import java.util.ArrayList;

public class Spaceship {

    private String name;
    private int fuelLevel;
    private ArrayList<Astronaut> crew;

    public Spaceship(String name, int fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.crew = new ArrayList<>();
    }

    public void addAstronaut(Astronaut astronaut){
        crew.add(astronaut);
    }

    public void launch(){
        if (fuelLevel >= 50) {
            System.out.println(name +  " has launched successfully!");
        } else {
            System.out.println(name +  " cannot launch. Not enough fuel.");
        }
    }

    public void displayDetails(){
        System.out.println("Spaceship: " + name + " | Fuel Level: " + fuelLevel);
        System.out.println("crew Members: ");
        for (Astronaut a : crew) {
            System.out.println(a.getDetails());
        }
    }
}
