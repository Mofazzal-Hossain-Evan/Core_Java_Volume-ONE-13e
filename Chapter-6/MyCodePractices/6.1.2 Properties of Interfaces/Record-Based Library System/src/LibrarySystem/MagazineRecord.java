package LibrarySystem;

/*
 * =========================
 * [From Core Java, Ch 4 & 6]
 * Implements only Searchable — cannot be borrowed.
 * Record is ideal for simple data classes (e.g., title + issueNumber).
 * =========================
 */
public record MagazineRecord(String title, int issueNumber) implements Searchable {

    @Override
    public boolean searchByTitle(String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }
}
