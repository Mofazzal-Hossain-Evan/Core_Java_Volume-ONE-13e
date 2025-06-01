package OnlineShopping;

public class Clothes extends Product{
    public Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    void applyDiscount(){
        System.out.println(name + "has 15% discount");
    }
}
