package SmartInventorySystem;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayInfo(){
        System.out.println("Clothing: " + name + ", Price: $" + price + ", Size: " + size);
    }
}
