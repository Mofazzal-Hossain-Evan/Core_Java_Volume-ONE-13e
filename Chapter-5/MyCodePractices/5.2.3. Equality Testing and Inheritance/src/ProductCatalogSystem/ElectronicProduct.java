package ProductCatalogSystem;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(int id, String productID, String name, int warrantyMonths) {
        super(id, productID, name);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}
