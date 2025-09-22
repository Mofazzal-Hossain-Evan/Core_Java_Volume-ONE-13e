package superhero;

/**
 * Mage subclass with extra field: mana
 */
public class Mage extends Superhero {
    private int mana;

    public Mage(String name, double powerLevel, int mana) {
        super(name, powerLevel);
        this.mana = mana;
    }

    @Override
    public Mage clone() {
        Mage copy = (Mage) super.clone();
        copy.mana = this.mana; // primitive, so safe
        return copy;
    }

    @Override
    public String toString() {
        return super.toString() + " [mana=" + mana + "]";
    }
}
