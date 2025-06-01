package OnlineShopping;

public class Oil extends Product{
    public Oil(String name, double price) {
        super(name, price);
    }

    @Override
    void applyDiscount() {
        System.out.println(name + " has 5% discount.");
    }
}
