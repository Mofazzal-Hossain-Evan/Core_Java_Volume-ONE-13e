package GalacticZoo;

public class AlienSpecies {
    private String speciesName;
    private String homePlanet;
    private int tentacles;
    private boolean isHostile;

    public AlienSpecies(String speciesName, String homePlanet, int tentacles, boolean isHostile) {
        this.speciesName = speciesName;
        this.homePlanet = homePlanet;
        this.tentacles = tentacles;
        this.isHostile = isHostile;
    }



    @Override
    public String toString() {
        return getClass().getSimpleName() + "[species=" + speciesName +
                "Planet= " + homePlanet +
                "tentacles=" + tentacles +
                "hostile+" + isHostile + "]";
    }
}
