package GalacticZoo;

public class ShapeShifter extends AlienSpecies{

    private String disguiseForm;

    public ShapeShifter(String speciesName, String homePlanet, int tentacles, boolean isHostile, String disguiseForm) {
        super(speciesName, homePlanet, tentacles, isHostile);
        this.disguiseForm = disguiseForm;
    }



    @Override
    public String toString() {
        return super.toString() + "ShapeShifter{" +
                "disguiseForm='" + disguiseForm + '\'' +
                '}';
    }
}
