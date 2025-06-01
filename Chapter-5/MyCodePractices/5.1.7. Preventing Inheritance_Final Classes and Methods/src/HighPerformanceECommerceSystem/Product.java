package HighPerformanceECommerceSystem;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // This method is final, so it cannot be overridden in subclasses and can be optimized by JIT compiler

    public final double getPrice(){
        //এখন getPrice() মেথড final। এর মানে হল যে JIT Compiler এখন এই মেথডটিকে ইনলাইন অপ্টিমাইজ করতে পারে,
        // যেটি পারফরম্যান্স বাড়াবে।এখন getPrice() মেথড final। এর মানে হল যে JIT Compiler এখন এই মেথডটিকে ইনলাইন অপ্টিমাইজ করতে পারে, যেটি পারফরম্যান্স বাড়াবে।
        return price;
    }

    public String getName() {
        return name;
    }
}
