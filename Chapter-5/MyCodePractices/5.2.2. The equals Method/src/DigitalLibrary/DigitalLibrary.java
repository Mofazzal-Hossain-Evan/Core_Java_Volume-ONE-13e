package DigitalLibrary;

public class DigitalLibrary {
    public static void main(String[] args) {
        eBOOK ebook1 = new eBOOK("Effective Java", "Joshua Bloch", 3, 2018, "PDF");
        eBOOK ebook2 = new eBOOK("Effective Java", "Joshua Bloch", 2, 2012, "PDF");
        eBOOK ebook3 = new eBOOK("Effective Java", "Joshua Bloch", 2, 2012, "EPUB");

        PrintedBook pbook1 = new PrintedBook("Effective Java", "Joshua Bloch", 3, 2018, "Hardcover");
        PrintedBook pbook2 = new PrintedBook("Effective Java", "Joshua Bloch", 3, 2018, "Paperback");

        // Content equality (title & author)
        System.out.println("ebook1 equals ebook2? " + ebook1.equals(ebook2)); // true (same format)
        System.out.println("ebook2 equals ebook3? " + ebook2.equals(ebook3)); // false (different format)
        System.out.println("pbook1 equals pbook2? " + pbook1.equals(pbook2)); // false (different binding)
        System.out.println("ebook1 equals pbook1? " + ebook1.equals(pbook1)); // false (different class)
    }
}
