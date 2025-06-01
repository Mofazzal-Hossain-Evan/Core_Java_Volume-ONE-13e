package OceanLifeTracker;

public class MarineAnimal {
    private String species;
    private int id;
    private String zone;
    private boolean endangered;

    public MarineAnimal(String species, int id, String zone, boolean endangered) {
        this.species = species;
        this.id = id;
        this.zone = zone;
        this.endangered = endangered;
    }

    @Override
    public String toString() {
        return species + "{" + id + "} - " + zone + (endangered ? "[Endangered]" : "");
    }
}

