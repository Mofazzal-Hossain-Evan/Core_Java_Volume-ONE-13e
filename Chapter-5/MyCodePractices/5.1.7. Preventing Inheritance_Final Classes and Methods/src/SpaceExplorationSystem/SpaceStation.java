package SpaceExplorationSystem;

public final class SpaceStation{
private final String name;

    public SpaceStation(String name) {
        this.name = name;
    }

    public final String getStationInfo(){
        return "Space Station " + name;
    }
}