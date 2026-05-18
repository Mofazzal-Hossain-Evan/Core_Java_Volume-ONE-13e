package NatureBugSystem;

public final class WaterBeetle extends Bug implements Crawlable, Swimmable, Comparable<WaterBeetle> {

    public WaterBeetle(String name, int age, double weight, String habitat) {
        super(name, age, weight, habitat);
    }

    @Override
    public void crawl(double speedCm) {
        System.out.println("🪲 WaterBeetle crawls at " + speedCm + " cm/min");
    }

    @Override
    public void swim(double depth) {
        System.out.println("🌊🪲 WaterBeetle swims at " + depth + " meters depth");
    }

    @Override
    public void eat(String food, double grams) {
        System.out.println("🪲 WaterBeetle eats " + grams + "g of " + food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println("😴🪲 WaterBeetle sleeps for " + hours + " hours");
    }

    @Override
    public String getBugType() {
        return "🪲 WaterBeetle";
    }

    @Override
    public String getBugName() {
        return "WaterBeetle";
    }

    @Override
    public String getBugDescription() {
        return "🪲 A water and land crawling insect";
    }

    @Override
    public int compareTo(WaterBeetle o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public void dig(int depthCm) {
        System.out.println("🪲 WaterBeetle rarely digs at " + depthCm + " cm");
    }

    @Override
    public void fly(double altM) {
        System.out.println("🪲 WaterBeetle cannot fly (attempted " + altM + " meters)");
    }
}