package MasterChef;

import java.util.Random;

public class ChefGenerator {
    private static final Random rand = new Random();

    public static Chef getRandomChef(){
        return switch (rand.nextInt(5)){
            case 0 -> new HeadChef();
            case 1 -> new PastryChef();
            case 2 -> new SousChef();
            case 3 -> new InternChef();
            default -> new UnknownChef();

        };
    }
}
