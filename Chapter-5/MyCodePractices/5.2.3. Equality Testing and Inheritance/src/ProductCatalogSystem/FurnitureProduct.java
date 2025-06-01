package ProductCatalogSystem;

public class FurnitureProduct extends Product{
    private String material;

    public FurnitureProduct(int id, String productID, String name, String material) {
        super(id, productID, name);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


}
