package ZooJSONProject;

public final record ZooElephant(String name) implements ZooAnimal {
    public String toString() { return name + " the Elephant says PAWOO!"; }

}
