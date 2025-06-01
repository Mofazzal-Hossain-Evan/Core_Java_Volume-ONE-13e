package ZooJSONProject;

public final record ZooParrot(String catchphrase) implements ZooAnimal{
    public String toString() { return "Parrot says: " + catchphrase; }
}


