package LibrarySystem;

/*
 * =========================
 * [From Core Java, Ch 3 & 7]
 * Java records are immutable data carriers —
 * They automatically generate constructors, equals(), hashCode(), toString().
 * Implements both Borrowable and Searchable.
 * =========================
 */
public record BookRecord(String title, String author) implements Borrowable, Searchable {

    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning book: " + title);
    }

    @Override
    public boolean searchByTitle(String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }
}
