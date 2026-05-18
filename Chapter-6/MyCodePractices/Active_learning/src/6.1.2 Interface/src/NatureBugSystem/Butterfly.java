package NatureBugSystem;

public final class Butterfly extends Bug implements Flyable, Crawlable, Comparable<Butterfly> {

    public Butterfly(String name, int age, double weight, String habitat) {
        super(name, age, weight, habitat);
    }

    @Override
    public void fly(double altM) {
        System.out.println("🦋 Butterfly flies at " + altM + " meters altitude");
    }

    @Override
    public void crawl(double speedCm) {
        System.out.println("🦋 Butterfly crawls at " + speedCm + " cm/min");
    }

    @Override
    public void eat(String food, double grams) {
        System.out.println("🦋 Butterfly eats " + grams + "g of " + food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println("😴🦋 Butterfly sleeps for " + hours + " hours");
    }

    @Override
    public String getBugType() {
        return "🦋 Butterfly";
    }

    @Override
    public String getBugName() {
        return "Butterfly";
    }

    @Override
    public String getBugDescription() {
        return "🦋 A beautiful flying insect";
    }

    @Override
    public int compareTo(Butterfly o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public void dig(int depthCm) {
        System.out.println("🦋 Butterfly cannot dig but attempts at " + depthCm + " cm");
    }

    @Override
    public void swim(double depth) {
        System.out.println("🌊🦋 Butterfly floats lightly at " + depth + " meters");
    }
}