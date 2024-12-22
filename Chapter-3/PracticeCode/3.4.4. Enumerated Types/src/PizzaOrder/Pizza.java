package PizzaOrder;

enum Size {
    SMALL,MEDIUM,LARGE,EXTRA_LARGE}

public class Pizza {

    private Size size;

    public Pizza(Size size) {
        this.size= size;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

}

