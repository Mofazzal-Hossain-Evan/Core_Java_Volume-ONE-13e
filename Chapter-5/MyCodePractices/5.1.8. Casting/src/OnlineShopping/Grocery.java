package OnlineShopping;

public class Grocery extends Product{
    public Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    void applyDiscount() {
        System.out.println(name + " has 5% discount.");
    }
}
