package DinosaurDNAComparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Dinosaur {
    private String species;
    private int id;
    private LocalDate cloneDate;
    private String[] traits;
    private char[][] dnaPattern;

    public Dinosaur(String species, int id, LocalDate cloneDate, String[] trails, char[][] dnaPattern) {
        this.species = species;
        this.id = id;
        this.cloneDate = cloneDate;
        this.traits = trails;
        this.dnaPattern = dnaPattern;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Dinosaur other)) return false;

        return id == other.id &&
                Objects.equals(species, other.species) &&
                Objects.equals(cloneDate, other.cloneDate) &&
                Arrays.equals(traits, other.traits) &&
                deepCharArrayEquals(dnaPattern, other.dnaPattern);
    }

    private boolean deepCharArrayEquals(char[][]a, char[][]b){
        if (a == null || b == null) return a == b;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++){
            if (Arrays.equals(a[i], b[i])) return false;
        }
        return true;
    }

    public int hashCode(){
        return Objects.hash(species, id, cloneDate) +
                Arrays.hashCode(traits) +
                Arrays.deepHashCode(dnaPattern);
    }



    @Override
    public String toString() {
        return "Dinosaur{" +
                "species='" + species + '\'' +
                ", id=" + id +
                ", cloneDate=" + cloneDate +
                ", traits=" + Arrays.toString(traits) +
                ", dnaPattern=" + Arrays.toString(dnaPattern) +
                '}';
    }
}
