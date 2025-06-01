package SmartInventorySystem;

public class SmartInventory {
    public static void main(String[] args) {
        Product[] products = {
                new Electronic("Laptop", 1200, 2),
                new Grocery("Apples", 3.5, 1.2),
                new Clothing("T-Shirt", 20, "M"),
                new Electronic("Smartphone", 999, 1),
                new Grocery("Banana", 1.5, 1.0)
        };

        for( Product p : products) {
            // ✅ Using Pattern Matching + Ternary Operator
String extraInfo = p instanceof Electronic e ? "Warranty " + e.getWarranty() + " Years"
        : p instanceof Grocery g ? "Weight " + g.getWeight() + "Kg"
        : p instanceof Clothing c ? "Size " + c.getSize()
        : "No extra info";
            System.out.println("Product: " + p.name + ", Price: $" + p.price + " -> " + extraInfo);
        }
    }
}
