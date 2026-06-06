package SpaceSystem;

public final class IcePlanet extends SpaceObject
implements Habitable, Mineable, Comparable<IcePlanet>{

    public IcePlanet(String name, double distanceAU, double temperature, String planetType) {
        super(name, distanceAU, temperature, planetType);
    }

    @Override
    public String getObjectType() {
        return "IcePlanet";
    }

    @Override
    public void explore(String astronaut){
        System.out.println(astronaut + " exploring icy " + name + " 🧊🚀");
    }
    @Override
    public void land(int seconds){
        System.out.println(name + " ice landing in " + seconds + "s ❄️");
    }
    @Override
    public void colonize(int population){
        System.out.println(name + " ice colony: " + population + " 🏔️");
    }

    @Override
    public void mine(String resource){
        System.out.println(name + " ice mining: " + resource + " ⛏️❄️");
    }
    @Override
    public Explorable getNextTarget(){
        return new Planet("Next-"+ name, distanceAU, temperature, planetType);
    }

    public int compareTo(IcePlanet other){
        return Double.compare(this.distanceAU, other.distanceAU);
    }
}
