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
/***
What It Does
Constructor:

A constructor is a special method in Java that is called when an object is created using the new keyword.
The constructor's purpose is to initialize the fields of the class with the provided values.
Parameters:

The constructor takes a parameter Size size,
 which represents the size of the pizza (SMALL, MEDIUM, LARGE, or EXTRA_LARGE).
        this.size:

The this keyword refers to the current object.
        this.size is the size field of the Pizza class.
By writing this.size = size;, you are assigning the value of the size parameter to the size field of the object.
***/