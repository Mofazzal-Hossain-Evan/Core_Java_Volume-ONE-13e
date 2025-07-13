package LibrarySystem;

/*
 * =========================
 * [From Core Java, Ch 6]
 * Demonstrates single-interface implementation (Borrowable).
 * Also showcases how sealed interfaces control implementation rights.
 * =========================
 */
public record DVDRecord(String title, int durationMinutes) implements Borrowable {

    @Override
    public void borrow() {
        System.out.println("Borrowing DVD: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Returning DVD: " + title);
    }
}
