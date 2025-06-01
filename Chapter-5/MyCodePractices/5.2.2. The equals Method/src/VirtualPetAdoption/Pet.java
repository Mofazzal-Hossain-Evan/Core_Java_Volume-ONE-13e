package VirtualPetAdoption;

import java.util.Objects;

public class Pet {

    private String name, species, color;
    private int age;

    public Pet(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;

        Pet other = (Pet) otherObject;
        return Objects.equals(name, other.age) && Objects.equals(species, other.species);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
