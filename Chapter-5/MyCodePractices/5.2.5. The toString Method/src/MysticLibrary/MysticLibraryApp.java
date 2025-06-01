package MysticLibrary;

import java.util.Arrays;
import java.util.Objects;

public class MysticLibraryApp {

    public static void main(String[] args) {

        Book[] shelf = {
                new SpellBook("Fire Codex", "Zarnak", 150, true, "Ignis Maxima"),
                new CursedScroll("Whispers of Doom", "Unknown", 50, true, 9),
                new Book("The Wandering Mage", "Elarion", 300, false),
             //   new MagicalRecordBook("Dreambinder", "Mind Control")
        };

        System.out.println("🔮 Welcome to the Mystic Library 🔮");
        System.out.println("Catalog:");
        for (Book book : shelf) {
            System.out.println("📘 " + book); // Auto toString()
        }

        System.out.println("\n📚 All books as array:");
        System.out.println(Arrays.toString(shelf));

        //  // toString fallback test
        Object obj = new Object();
        System.out.println("\nDefault Object output:");
        System.out.println(obj);

        // "" + obj test
        System.out.println("\nString conversion:");
        System.out.println("" + shelf[0]);

        //record type
        MagicalRecordBook recordBook = new MagicalRecordBook("Timebinder", "Temporal Freeze");
        System.out.println("\n📖 Record book info: " + recordBook);
    }


}
