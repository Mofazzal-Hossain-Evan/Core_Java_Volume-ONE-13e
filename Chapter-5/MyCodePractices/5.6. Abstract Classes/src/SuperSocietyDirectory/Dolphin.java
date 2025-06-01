package SuperSocietyDirectory;

public class Dolphin extends Animal implements Singer{
    public Dolphin(String name) {
        super(name);
    }

    public String getDescription(){
        return "a smart dolphin who sings and jokes";
    }

    public String singSong(){
        return "Eeeeeee eee ooo!";
    }

    public String tellAJoke(){
        return "What do dolphins use to clean their houses? Multi-porpoise cleaner!";
    }
}
