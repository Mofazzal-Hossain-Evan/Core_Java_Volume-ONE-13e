package SpaceSystem;

public final class Planet extends SpaceObject
        implements Habitable, Comparable<Planet> {

    public Planet(String name, double distanceAU,
                  double temperature, String planetType) {
        super(name, distanceAU, temperature, planetType);
    }

    @Override public String getObjectType() { return "Planet"; }

    @Override
    public void explore(String astronaut) {
        System.out.println(astronaut + " exploring " + name + " 🚀");
    }

    @Override
    public void land(int seconds) {
        System.out.println(name + " landing in " + seconds + "s 🛬");
    }

    @Override
    public void colonize(int population) {
        if (population > MAX_POP) {
            System.out.println(name + " — Too many people! ❌");
        } else {
            System.out.println(name + " colonized with " + population + " people 🏘️");
        }
    }

    @Override
    public Explorable getNextTarget() {
        return new Planet("Next-" + name, distanceAU + 1.0,
                temperature - 10, planetType);
    }

    @Override
    public int compareTo(Planet other) {
        return Double.compare(distanceAU, other.distanceAU);
    }
}