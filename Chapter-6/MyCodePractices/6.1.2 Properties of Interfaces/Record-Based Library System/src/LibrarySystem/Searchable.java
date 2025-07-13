package LibrarySystem;

/*
 * =========================
 * [From Core Java, Ch 6]
 * Regular (non-sealed) interfaces allow broad usage —
 * Any class or record can implement this.
 * Interfaces are often used for callback or filtering behavior like search, sorting etc.
 * =========================
 */
public interface Searchable {
    boolean searchByTitle(String title);
}
