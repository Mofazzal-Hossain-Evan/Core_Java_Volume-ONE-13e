package AdvancedFoodOrder_DeliverySystem;

public class RegularCustomer extends Customer{
    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    void applyDiscount(){
        System.out.println(name + "gets a 5% discount");
        totalBill *= 0.95;
    }
}
