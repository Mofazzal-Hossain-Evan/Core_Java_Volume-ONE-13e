package BoardGame;

import java.util.Objects;

public class PLayer {

    private String name;
    private int rating ;
    private String strategy;

    public PLayer(String name, int rating, String strategy) {
        this.name = name;
        this.rating = rating;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getStrategy() {
        return strategy;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;

        PLayer other = (PLayer) otherObject;
        return rating == other.rating && Objects.equals(strategy, other.strategy);
    }

    @Override
    public String toString() {
        return "PLayer{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", strategy='" + strategy + '\'' +
                '}';
    }
}
