package SmartInventorySystem;

public class Grocery extends Product{
    private double weight;

    public Grocery(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void displayInfo(){
        System.out.println("Grocery: " + name + ", Price: $" + price + ", Weight: " + weight + "kg");
    }
}
