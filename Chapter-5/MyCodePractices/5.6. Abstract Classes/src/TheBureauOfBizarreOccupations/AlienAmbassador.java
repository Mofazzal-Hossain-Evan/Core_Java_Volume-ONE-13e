package TheBureauOfBizarreOccupations;

public class AlienAmbassador extends Employee implements Funny, DangerousJob {

    public AlienAmbassador(String name) {
        super(name);
    }

    public String getJobDescription(){
        return "negotiates with aliens using memes and snacks.";
    }

    @Override
    public String safetyWarning() {
        return "Beware of probing. Always wear a helmet.";
    }

    @Override
    public String tellAJoke() {
        return  "Why don’t aliens visit Earth? Ratings are too low.";
    }
}
