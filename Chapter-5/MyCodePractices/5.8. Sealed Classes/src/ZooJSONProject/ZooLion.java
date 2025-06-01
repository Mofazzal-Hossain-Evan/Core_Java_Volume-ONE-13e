package ZooJSONProject;

public final record ZooLion(String name) implements ZooAnimal{
    public String toString(){
        return name +  " the Lion says ROAR!";
    }
}

