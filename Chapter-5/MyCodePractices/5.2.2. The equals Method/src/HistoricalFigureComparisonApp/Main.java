package HistoricalFigureComparisonApp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scientist einstein1 = new Scientist("Albert Einstein", LocalDate.of(1879, 3, 14), "Theory of Relativity", "Physics");
        Scientist einstein2 = new Scientist("Albert Einstein", LocalDate.of(1879, 3, 14), "Theory of Relativity", "Physics");

        Politician lincoln = new Politician("Abraham Lincoln", LocalDate.of(1809, 2, 12), "Ending Slavery", "USA");
        Artist vanGogh = new Artist("Vincent Van Gogh", LocalDate.of(1853, 3, 30), "Post-Impressionism", "Impressionism");

        System.out.println("Einstein1 equals Einstein2? " + einstein1.equals(einstein2));
        System.out.println("Einstein1 equals Lincoln? " + einstein1.equals(lincoln));
        System.out.println("Van Gogh: " + vanGogh);
    }
}