package LibrarySystem;

/*
 * =========================
 * [From Core Java, Ch 3 & 6]
 * Interfaces define a contract of methods that a class (or record) must implement.
 * Sealed interfaces (Java 17+) allow limiting which classes or records can implement it.
 * Great for controlling hierarchies — especially in large systems.
 * =========================
 */

public sealed  interface Borrowable permits BookRecord, DVDRecord {
    int MAX_BORROW_DAYS = 14;
void borrow();
void returnItem();

}
