package SpaceSystem;

public final class StarBase extends SpaceObject
        implements Observable, Comparable<StarBase> {

    public StarBase(String name, double distanceAU,
                    double temperature, String planetType) {
        super(name, distanceAU, temperature, planetType);
    }

    @Override public String getObjectType() { return "StarBase"; }

    @Override
    public void explore(String astronaut) {
        System.out.println(astronaut + " entering " + name + " 🛰️");
    }

    @Override
    public void land(int seconds) {
        System.out.println(name + " docking in " + seconds + "s 🚉");
    }

    @Override
    public void observe(String tool) {
        System.out.println(name + " observing with " + tool + " 🔭");
    }

    @Override
    public Explorable getNextTarget() {
        return new StarBase("Next-" + name, distanceAU + 2.0,
                temperature, planetType);
    }

    @Override
    public int compareTo(StarBase other) {
        return Double.compare(distanceAU, other.distanceAU);
    }
}