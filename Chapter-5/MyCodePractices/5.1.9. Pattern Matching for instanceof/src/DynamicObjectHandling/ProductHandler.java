package DynamicObjectHandling;

public class ProductHandler {

    public static void main(String[] args) {

        Product[] products = {
                new Electronic("Laptop", 2),
                new Grocery("Apple", 1.5)
        };

        for (Product p : products) {
            String info = p instanceof Electronic e ?
                    "Warranty: " + e.getWarranty() + " years" :
                    "Regular Product";
            System.out.println("Product: "+ p.name + "->" + info);
        }
    }
}
