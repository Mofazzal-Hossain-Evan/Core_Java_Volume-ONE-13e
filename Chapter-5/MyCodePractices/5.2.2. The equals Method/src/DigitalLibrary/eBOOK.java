package DigitalLibrary;

import java.util.Objects;

public class eBOOK extends Book{
    private String format;

    public eBOOK(String title, String author, int edition, int year,  String format) {
        super(title, author, edition, year);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public boolean equals(Object otherObject){

        if (!super.equals(otherObject)) return false;
        if (getClass() != otherObject.getClass()) return false;

        eBOOK other = (eBOOK) otherObject;
        return Objects.equals(format, other.format);
    }

    @Override
    public String toString() {
        return "eBOOK{" +
                "format='" + format + '\'' +
                '}';
    }
}
