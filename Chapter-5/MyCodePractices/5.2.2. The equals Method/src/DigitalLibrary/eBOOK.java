package DigitalLibrary;

public class eBOOK extends Book{
    private String format;

    public eBOOK(String title, String author, int edition, int year, int isbn, String format) {
        super(title, author, edition, year, isbn);
        this.format = format;
    }
}
