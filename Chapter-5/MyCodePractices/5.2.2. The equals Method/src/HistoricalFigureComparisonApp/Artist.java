package HistoricalFigureComparisonApp;

import java.time.LocalDate;
import java.util.Objects;



public class Artist extends HistoricalFigure {
    private String artStyle;

    public Artist(String name, java.time.LocalDate birthDate, String knownFor, String artStyle) {
        super(name, birthDate, knownFor);
        this.artStyle = artStyle;
    }

    public String getArtStyle() {
        return artStyle;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (getClass() != otherObject.getClass()) return false;

        Artist other = (Artist) otherObject;
        return java.util.Objects.equals(artStyle, other.artStyle);
    }

    @Override
    public String toString() {
        return super.toString() + " [Art Style: " + artStyle + "]";
    }
}