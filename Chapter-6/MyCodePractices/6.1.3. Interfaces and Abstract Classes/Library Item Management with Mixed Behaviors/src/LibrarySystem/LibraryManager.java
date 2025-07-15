package LibrarySystem;

import java.util.*;

public class LibraryManager {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("Java Fundamentals", 101, "Cay Horstmann"));
        items.add(new Magazine("Tech Monthly", 102, 45));
        items.add(new DVD("Interstellar", 103, 169));

        System.out.println("📚 All Library Items:");
        for (LibraryItem item : items) {
            System.out.println(item.getDescription());
        }

        System.out.println("\n🔍 Searching for title containing 'java':");
        for (LibraryItem item : items) {
            if (item instanceof Searchable searchable && searchable.searchByTitle("java")) {
                System.out.println("Found: " + item.getDescription());
            }
        }

        System.out.println("\n📦 Borrowing items:");
        for (LibraryItem item : items) {
            if (item instanceof Borrowable borrowable) {
                borrowable.borrow();
                borrowable.returnItem();
            } else {
                System.out.println(item.getTitle() + " is not borrowable.");
            }
        }
    }
}
