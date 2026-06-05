package SpaceSystem;

public abstract non-sealed class SpaceObject
        implements SpaceBehavior {

    protected String name;
    protected double distanceAU;
    protected double temperature;
    protected String planetType;

    public SpaceObject(String name, double distanceAU,
                       double temperature, String planetType) {
        name        = name;
        distanceAU  = distanceAU;
        temperature = temperature;
        planetType  = planetType;
    }

    public String getName()        { return name; }
    public double getDistanceAU()  { return distanceAU; }
    public double getTemperature() { return temperature; }

    @Override
    public String getPlanetType()  { return planetType; }

    public abstract String getObjectType();

    @Override
    public String toString() {
        return getObjectType() +
                "[" + name +
                ", " + distanceAU + "AU" +
                ", " + temperature + "°C]";
    }
}