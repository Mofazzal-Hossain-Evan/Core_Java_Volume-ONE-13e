package HistoricalFigureComparisonApp;

import java.util.Objects;

public class Scientist extends HistoricalFigure {
    private String field;

    public Scientist(String name, java.time.LocalDate birthDate, String knownFor, String field) {
        super(name, birthDate, knownFor);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        if (!super.equals(otherObject)) return false;

        Scientist other = (Scientist) otherObject;
        return Objects.equals(field, other.field);
    }


    @Override
    public String toString() {
        return super.toString() + " [Field: " + field + "]";
    }
}