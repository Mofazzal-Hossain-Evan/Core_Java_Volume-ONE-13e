package superhero;

/**
 * Warrior subclass with extra field: weapon
 */
public class Warrior extends Superhero {
    private String weapon;

    public Warrior(String name, double powerLevel, String weapon) {
        super(name, powerLevel);
        this.weapon = weapon;
    }

    @Override
    public Warrior clone() {
        Warrior copy = (Warrior) super.clone();
        copy.weapon = this.weapon; // String is immutable, safe to share
        return copy;
    }

    @Override
    public String toString() {
        return super.toString() + " [weapon=" + weapon + "]";
    }
}
