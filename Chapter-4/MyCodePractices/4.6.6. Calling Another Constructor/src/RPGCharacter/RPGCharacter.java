package RPGCharacter;

public class RPGCharacter {
    private String name;
    private  String characterClass;

    // Constructor 1: Only class provided, assigns a default name

    public RPGCharacter(String characterClass) {
        this("Nameless Hero", characterClass);
    }

    // Constructor 2: Name and class both provided

    public RPGCharacter(String name, String characterClass){
        this.name = name;
        this.characterClass = characterClass;
    }

    public void display(){
        System.out.println("Character: " + name + " | Class: " + characterClass);
    }
}
