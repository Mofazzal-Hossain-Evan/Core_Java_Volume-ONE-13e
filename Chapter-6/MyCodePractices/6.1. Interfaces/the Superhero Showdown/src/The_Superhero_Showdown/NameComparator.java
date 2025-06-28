package The_Superhero_Showdown;

import java.util.Comparator;

// Comparator for sorting superheroes by name
public class NameComparator implements Comparator<Superhero> {
    // Implement compare method for sorting by name
    @Override
    public int compare(Superhero s1, Superhero s2) {
        // Compare names alphabetically
        return s1.getName().compareTo(s2.getName());
    }
}