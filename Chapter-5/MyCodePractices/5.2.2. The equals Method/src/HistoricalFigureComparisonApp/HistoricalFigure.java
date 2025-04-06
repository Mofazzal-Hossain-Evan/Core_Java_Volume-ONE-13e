package HistoricalFigureComparisonApp;

import java.time.LocalDate;
import java.util.Objects;

public class HistoricalFigure {
    private String name;
    private LocalDate birthDate;
    private String knownFor;

    public HistoricalFigure(String name, LocalDate birthDate, String knownFor) {
        this.name = name;
        this.birthDate = birthDate;
        this.knownFor = knownFor;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getKnownFor() {
        return knownFor;
    }



    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject ) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;

        HistoricalFigure other = (HistoricalFigure) otherObject;
        return Objects.equals(name, other.name)
                && Objects.equals(birthDate, other.birthDate)
                && Objects.equals(knownFor, other.knownFor);
    }

    @Override
    public String toString(){
        return name + " (born " + birthDate + "), known for: " + knownFor;
    }
    
}
