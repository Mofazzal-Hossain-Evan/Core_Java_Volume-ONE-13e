package AdvancedFoodOrder_DeliverySystem;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    void applyDiscount(){
        System.out.println(name + "gets a 10% discount");
        totalBill *= 0.90;
    }
}
