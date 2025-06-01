package AdvancedFoodOrder_DeliverySystem;

public class FoodOrderSystem {
    public static void main(String[] args) {

        Customer c1 = new RegularCustomer("Alice");
        Customer c2 = new PremiumCustomer("Bob");
        Customer c3 = new VIPCustomer("Charlie");

        c1.orderFood(50);
        c2.orderFood(100);
        c3.orderFood(200);

        c1.applyDiscount();
        c2.applyDiscount();
        c3.applyDiscount();

        c1.checkout();
        c2.checkout();
        c3.checkout();

        // Downcasting to access VIP-specific method
        if (c3 instanceof VIPCustomer){
            VIPCustomer vip = (VIPCustomer) c3;
            vip.fastDelivery();
        }
    }
}
