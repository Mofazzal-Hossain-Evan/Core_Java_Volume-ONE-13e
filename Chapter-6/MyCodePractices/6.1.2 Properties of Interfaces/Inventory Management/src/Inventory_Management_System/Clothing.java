package Inventory_Management_System;

public final class Clothing implements Categorizable, Duplicatable {

    private String type;
    private double price;
    private String category;

    public Clothing(String type, double price, String category) {
        this.type = type;
        this.price = price;
        this.category = category;
    }

    public Object duplicate() throws CloneNotSupportedException{
        return new Clothing(this.type, this.price, this.category);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
