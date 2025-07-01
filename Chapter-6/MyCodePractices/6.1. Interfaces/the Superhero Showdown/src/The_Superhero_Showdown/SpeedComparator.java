
        package The_Superhero_Showdown;

import java.util.Comparator;

// Comparator for sorting superheroes by speed
public class SpeedComparator implements Comparator<Superhero> {
    // Implement compare method for sorting by speed
    @Override
    public int compare(Superhero s1, Superhero s2) {
        // Compare speeds using Double.compare for correct double comparison
        int speedComparison = Double.compare(s1.getSpeed(), s2.getSpeed());
        // If speeds are equal, use name as tie-breaker
        return speedComparison != 0 ? speedComparison : s1.getName().compareTo(s2.getName());
    }
}
