package inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * Item ক্লাস (Inventory এর জন্য)
 * Cloneable implement করে deep copy তৈরি করবে।
 */
public class Item implements Cloneable {
    private String productName;
    private double price;
    private Map<String, String> attributes; // mutable Map

    public Item(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.attributes = new HashMap<>();
    }

    // attribute যোগ করার জন্য method
    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    // clone() override
    @Override
    public Item clone() {
        try {
            Item copy = (Item) super.clone();
            // deep copy of mutable Map
            copy.attributes = new HashMap<>(this.attributes);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported!");
        }
    }

    // toString override for nice printing
    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", attributes=" + attributes +
                '}';
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
