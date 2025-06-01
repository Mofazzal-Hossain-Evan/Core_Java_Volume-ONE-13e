package AdvancedFoodOrder_DeliverySystem;

public class VIPCustomer extends Customer{

    public VIPCustomer(String name) {
        super(name);
    }

    @Override
    void applyDiscount(){
        System.out.println(name + "gets a 15% discount");
        totalBill *= 0.85;
    }

    void fastDelivery(){
        System.out.println(name + " gets **Fast Delivery** 🚀!");
    }
}
