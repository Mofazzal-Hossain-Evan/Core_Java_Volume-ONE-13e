package ZooJSONProject;

public final record ZooSnake(String species) implements ZooAnimal {
    public String toString() { return species + " Snake goes HISS!"; }
}
