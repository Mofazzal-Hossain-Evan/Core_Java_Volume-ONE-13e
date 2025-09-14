/* Package declaration to match directory structure */
package Inventory_Item_Duplicator;

/* Theory: *Core Java* (Volume I, 13th Edition, Chapter 6) discusses implementing Cloneable with deep copies for mutable collections like attributes to ensure clone independence, similar to entity duplication in Jakarta EE (Horstmann, p. 271). *Effective Java* (Item 13) advises careful deep cloning for maps to prevent shared mutable state (Bloch, p. 56). */

/* Item class implementing Cloneable */
public class Item implements Cloneable {
    private String productName;
    private double price;
    private java.util.Map<String, String> attributes;

    public Item(String productName, double price, java.util.Map<String, String> attributes) {
        this.productName = productName;
        this.price = price;
        this.attributes = attributes;
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        Item clone = (Item) super.clone();
        clone.attributes = new java.util.HashMap<>(this.attributes); // Deep copy of attributes
        return clone;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Item{productName='" + productName + "', price=" + price + ", attributes=" + attributes + '}';
    }
}