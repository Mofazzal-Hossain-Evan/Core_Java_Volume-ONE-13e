package SuperSocietyDirectory;

public class Tiger extends Animal implements Dangerous{
    public Tiger(String name) {
        super(name);
    }

    public String getDescription(){
        return "a ferocious tiger";
    }

    public String makeThreat(){
        return "Grrrr! I will pounce on you!";

    }
}
