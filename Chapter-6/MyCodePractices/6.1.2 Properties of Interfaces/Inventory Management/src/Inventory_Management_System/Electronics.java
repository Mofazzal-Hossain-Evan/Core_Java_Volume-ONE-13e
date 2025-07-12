package Inventory_Management_System;

public final class  Electronics implements Categorizable, Duplicatable{

    private String model;
    private double price;
    private String category;

    public Electronics(String model, double price, String category) {
        this.model = model;
        this.price = price;
        this.category = category;
    }

    public Object duplicate() throws CloneNotSupportedException{
        return new Electronics(this.model, this.price, this.category);
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    /* Setter for price */
    public void setPrice(double price) {
        this.price = price; // Update electronics price
    }

    /* Override toString for readable output */
    @Override
    public String toString() {
        return "Electronics{model='" + model + "', price=" + price + ", category='" + category + "'}";
    }
}
