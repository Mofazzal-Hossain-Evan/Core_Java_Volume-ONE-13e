package DigitalLibrary;

import java.util.Objects;

public class PrintedBook extends Book{
    private String bindingType;

    public PrintedBook(String title, String author, int edition, int year,  String bindingType) {
        super(title, author, edition, year);
        this.bindingType = bindingType;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        if (getClass() != otherObject.getClass()) return false;

        PrintedBook other = (PrintedBook) otherObject;
        return Objects.equals(bindingType, other.bindingType);
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "bindingType='" + bindingType + '\'' +
                '}';
    }
}
