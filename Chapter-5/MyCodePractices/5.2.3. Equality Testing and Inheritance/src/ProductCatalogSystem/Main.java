package ProductCatalogSystem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Product p1 = new ElectronicProduct(1, "P1001", "Laptop", 24);
        Product p2 = new FurnitureProduct(2, "P1001", "Chair", "Wood");
        Product p3 =  new ElectronicProduct(3, "P1002", "TV", 12);


        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // ❌ false: different productId

        Map<Product, Integer> cart = new HashMap<>();
        cart.put(p1, 1);
        cart.put(p2, cart.getOrDefault(p2, 0)+2); // Add 2 more Chairs — same ID as Laptop

        // 🔄 Because p1 and p2 have same productId, they are equal — value will be overwritten

        System.out.println("\n🛒 Shopping Cart Contents:");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()){
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue());
        }

        // ✅ Confirm with containsKey
        System.out.println("\nCart contains p1? " + cart.containsKey(p1)); // true
        System.out.println("Cart contains p2? " + cart.containsKey(p2)); // true
        System.out.println("Cart contains p3? " + cart.containsKey(p3)); // false

        // 🔍 Comparing with ObjectInfo directly
        ObjectInfo obj1 = new ObjectInfo(1);
        ObjectInfo obj2 = new ObjectInfo(1);
        ObjectInfo obj3 = new ObjectInfo(2);

        System.out.println("\nobj1.equals(obj2)? " + obj1.equals(obj2)); // true
        System.out.println("obj1.equals(obj3)? " + obj1.equals(obj3)); // false
    }
}
