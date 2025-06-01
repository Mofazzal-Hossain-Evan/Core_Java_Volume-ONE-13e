package ZooJSONProject;

public final record ZooTiger(String name) implements ZooAnimal{
    public String toString(){return name +" the Tiger says GRRR!"; }
}


