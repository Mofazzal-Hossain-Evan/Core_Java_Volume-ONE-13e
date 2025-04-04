package DynamicObjectHandling;

public class Electronic extends Product{

    private int warranty;

    public Electronic(String name, int warranty) {
        super(name);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}
