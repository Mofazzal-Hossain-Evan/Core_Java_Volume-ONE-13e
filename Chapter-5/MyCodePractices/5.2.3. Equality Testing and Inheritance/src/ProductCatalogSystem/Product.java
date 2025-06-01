package ProductCatalogSystem;

import java.util.Objects;

public class Product  extends ObjectInfo{
    private String productID, name;

    public Product(int id, String productID, String name) {
        super(id);
        this.productID = productID;
        this.name = name;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }


    @Override
    public final boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (!(otherObject instanceof Product other)) return false;
        return Objects.equals(productID, other.productID);


    }

    @Override
    public final int hashCode(){
        return Objects.hash(productID);
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "[productId=" + productID + ", name=" + name + "]";
    }

}
