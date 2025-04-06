package HistoricalFigureComparisonApp;

import java.util.Objects;
import java.time.LocalDate;

public class Politician extends HistoricalFigure {
    private String country;

    public Politician(String name, java.time.LocalDate birthDate, String knownFor, String country) {
        super(name, birthDate, knownFor);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (getClass() != otherObject.getClass()) return false;

        Politician other = (Politician) otherObject;
        return java.util.Objects.equals(country, other.country);
    }

    @Override
    public String toString() {
        return super.toString() + " [Country: " + country + "]";
    }
}