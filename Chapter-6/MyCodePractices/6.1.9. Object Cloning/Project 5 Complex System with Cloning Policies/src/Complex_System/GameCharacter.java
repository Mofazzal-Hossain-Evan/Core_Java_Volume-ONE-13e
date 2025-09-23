package Complex_System;
import java.util.ArrayList;
import java.util.List;

class GameCharacter implements CloneableComponent {
    private String name;
    private List<Weapon> weapons;
    private Artifact artifact; // non-cloneable reference

    public GameCharacter(String name, Artifact artifact) {
        this.name = name;
        this.artifact = artifact;
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon w) {
        weapons.add(w);
    }

    @Override
    public CloneableComponent cloneComponent(ClonePolicy policy) throws CloneNotSupportedException {
        if (policy == ClonePolicy.NONE) {
            throw new CloneNotSupportedException("GameCharacter cloning not allowed!");
        }

        if (policy == ClonePolicy.SHALLOW) {
            // শুধু reference copy
            GameCharacter copy = (GameCharacter) super.clone();
            copy.weapons = this.weapons; // shallow: same list reference
            return copy;
        }

        if (policy == ClonePolicy.DEEP) {
            // deep copy
            GameCharacter copy = (GameCharacter) super.clone();
            copy.weapons = new ArrayList<>();
            for (Weapon w : this.weapons) {
                copy.weapons.add((Weapon) w.cloneComponent(ClonePolicy.DEEP));
            }
            // Artifact is not cloneable, so keep same reference
            copy.artifact = this.artifact;
            return copy;
        }

        return null;
    }

    @Override
    public String toString() {
        return "GameCharacter{name='" + name + "', weapons=" + weapons + ", artifact=" + artifact + "}";
    }
}
