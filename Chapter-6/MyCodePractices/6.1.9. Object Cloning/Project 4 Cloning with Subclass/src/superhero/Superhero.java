package superhero;

import java.util.ArrayList;
import java.util.List;

/**
 * Base Superhero class
 */
public class Superhero implements Cloneable {
    protected String name;
    protected double powerLevel;
    protected List<String> abilities;

    public Superhero(String name, double powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.abilities = new ArrayList<>();
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    @Override
    public Superhero clone() {
        try {
            Superhero copy = (Superhero) super.clone();
            // deep copy of abilities
            copy.abilities = new ArrayList<>(this.abilities);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", abilities=" + abilities +
                '}';
    }
}
