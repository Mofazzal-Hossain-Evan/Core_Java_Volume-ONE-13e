package SpaceSystem;

public final class StarBase extends SpaceObject
implements Observable, Comparable<StarBase>{

    public StarBase(String name, double distanceAU, double temperature, String planetType) {
        super(name, distanceAU, temperature, planetType);
    }


}
