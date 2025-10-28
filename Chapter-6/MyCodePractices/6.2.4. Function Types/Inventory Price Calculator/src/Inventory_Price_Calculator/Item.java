/* Package declaration */
package Inventory_Price_Calculator;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস ডেটা হোল্ড করে, যা ল্যামডা দিয়ে প্রসেস করা যায়। */

/* Item class */
public class Item {
    private String name;
    private double basePrice;
    private double discountRate;
    private double finalPrice;

    public Item(String name, double basePrice, double discountRate) {
        this.name = name;
        this.basePrice = basePrice;
        this.discountRate = Math.min(1.0, Math.max(0.0, discountRate)); // 0.0 to 1.0
        this.finalPrice = basePrice * (1 - this.discountRate);
    }

    // Getters
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public double getDiscountRate() { return discountRate; }
    public double getFinalPrice() { return finalPrice; }

    // Setter for final price (if recomputed)
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return String.format("%s | Base: $%.2f | Discount: %.0f%% | Final: $%.2f",
                name, basePrice, discountRate * 100, finalPrice);
    }
}