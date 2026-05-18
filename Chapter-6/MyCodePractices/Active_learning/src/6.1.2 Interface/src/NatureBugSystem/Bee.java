package NatureBugSystem;

public final class Bee extends Bug implements Flyable, Comparable<Bee> {

    public Bee(String name, int age, double weight, String habitat) {
        super(name, age, weight, habitat);
    }

    @Override
    public void fly(double altM) {
        System.out.println("🐝 Bee flies at " + altM + " meters altitude");
    }

    @Override
    public void eat(String food, double grams) {
        System.out.println("🐝 Bee eats " + grams + "g of " + food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println("😴🐝 Bee sleeps for " + hours + " hours");
    }

    @Override
    public String getBugType() {
        return "🐝 Bee";
    }

    @Override
    public String getBugName() {
        return "Bee";
    }

    @Override
    public String getBugDescription() {
        return "🐝 A flying insect that produces honey";
    }

    @Override
    public void crawl(double speedCm) {
        System.out.println("🐝 Bee rarely crawls at " + speedCm + " cm/min");
    }

    @Override
    public void dig(int depthCm) {
        System.out.println("🐝 Bee cannot dig");
    }

    @Override
    public void swim(double depth) {
        System.out.println("🌊🐝 Bee floats on water surface");
    }

    @Override
    public int compareTo(Bee o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }
}