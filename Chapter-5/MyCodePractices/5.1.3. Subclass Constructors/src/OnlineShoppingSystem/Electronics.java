package OnlineShoppingSystem;

public class Electronics extends  Product{
    private double warrantyDiscount;

    public Electronics(String name, double price, double warrantyDiscount) {
        super(name, price);
        this.warrantyDiscount = warrantyDiscount;
    }

    @Override
    public double calculateDiscountPrice(){
        return price - warrantyDiscount;
    }
}
