package AdvancedFoodOrder_DeliverySystem;

public class Customer {
    String name;
    double totalBill;

    public Customer(String name) {
        this.name = name;
        this.totalBill = 0;
    }

    void orderFood(double price){
        totalBill= totalBill + price;
        System.out.println(name +" ordered food worth $" + price);
    }

    void applyDiscount(){
        System.out.println(name + " has no discount.");
    }

    void checkout(){
        System.out.println(name + "'s Final Bill: $" + totalBill );
    }
}
