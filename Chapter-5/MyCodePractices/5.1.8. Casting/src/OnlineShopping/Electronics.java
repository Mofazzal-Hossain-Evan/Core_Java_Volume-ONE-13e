package OnlineShopping;

public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    void applyDiscount(){
        System.out.println(name + "has 1% discount");
    }
}

