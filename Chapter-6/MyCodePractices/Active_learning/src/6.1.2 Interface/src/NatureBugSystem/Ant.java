package NatureBugSystem;

public final class Ant extends Bug implements Flyable, Crawlable, Comparable<Ant> {

    public Ant(String name, int age, double weight, String habitat) {
        super(name, age, weight, habitat);
    }

    @Override
    public String getBugType() {
        return "🐜 Ant";
    }

    @Override
    public String getBugName() {
        return "Ant";
    }

    @Override
    public String getBugDescription() {
        return "🐜 A hardworking crawling insect";
    }

    @Override
    public void crawl(double speedCm) {
        System.out.println("🐜 Ant crawls at " + speedCm + " cm/min");
    }

    @Override
    public void dig(int depthCm) {
        System.out.println("⛏️🐜 Ant digs at " + depthCm + " cm depth");
    }

    @Override
    public void fly(double altM) {
        System.out.println("🐜 Ant cannot fly (attempted altitude: " + altM + " meters)");
    }

    @Override
    public void swim(double depth) {
        System.out.println("🌊🐜 Ant can only float at shallow depth: " + depth + " meters");
    }

    @Override
    public void eat(String food, double grams) {
        System.out.println("🐜 Ant eats " + grams + "g of " + food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println("😴🐜 Ant sleeps for " + hours + " hours");
    }

    @Override
    public int compareTo(Ant o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }
}