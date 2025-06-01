package SuperSocietyDirectory;

public class Parrot extends Animal implements Singer{
    public Parrot(String name) {
        super(name);
    }

    public String getDescription(){
        return "a colorful parrot who sings";
    }
    @Override
    public String singSong(){
        return "Tweet tweet la-la-la!";
    }
}
