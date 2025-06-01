package SmartInventorySystem;

public class Electronic extends Product{
    private int warranty;

    public Electronic(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
   public void displayInfo(){
        System.out.println("Electronic: " + name + ", Price: $" + price + ", Warranty: " + warranty + " years");
    }
}
