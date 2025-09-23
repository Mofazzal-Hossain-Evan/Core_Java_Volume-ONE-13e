package Complex_System;

class Weapon implements CloneableComponent {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public CloneableComponent cloneComponent(ClonePolicy policy) throws CloneNotSupportedException {
        if (policy == ClonePolicy.NONE) {
            throw new CloneNotSupportedException("Weapon cloning not allowed!");
        }
        if (policy == ClonePolicy.SHALLOW) {
            return (Weapon) super.clone(); // shallow works fine (all primitives + String)
        }
        if (policy == ClonePolicy.DEEP) {
            // primitive + immutable String থাকায় deep/shallow একই
            return new Weapon(this.name, this.damage);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "', damage=" + damage + "}";
    }
}
