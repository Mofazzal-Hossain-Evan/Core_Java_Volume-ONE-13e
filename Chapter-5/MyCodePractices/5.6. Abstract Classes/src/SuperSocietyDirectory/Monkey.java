package SuperSocietyDirectory;

public class Monkey extends Animal implements Funny{
    public Monkey(String name) {
        super(name);
    }

    public String getDescription(){
        return "a cheeky monkey";
    }
    public String tellAJoke(){
        return  "Why don’t monkeys play cards in the jungle? Too many cheetahs!";
    }
}
