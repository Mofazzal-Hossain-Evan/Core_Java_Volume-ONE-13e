package FantasyCreatureEncyclopedia;

import java.util.ArrayList;

public class Creature {
    private String name;
    private String type;
    private ArrayList<String> abilities;

    public Creature(String name, String type, ArrayList<String> abilities) {
        this.name = name;
        this.type = type;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
