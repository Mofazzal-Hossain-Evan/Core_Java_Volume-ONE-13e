package SpaceSystem;

public final class  Asteroid extends SpaceObject
implements Mineable, Comparable<Asteroid>{
    public Asteroid(String name, double distanceAU, double temperature, String planetType) {
        super(name, distanceAU, temperature, planetType);

    }
        @Override
        public String getObjectType() {
            return "Asteroid"; }
@Override
    public void explore(String astronaut){
    System.out.println(astronaut + " scanning " + name + " ☄️");
}
@Override
    public void land(int seconds){
    System.out.println(name + " docking in " + seconds + "s 🛸");
}

public void mine(String resource){
    System.out.println(name + " mining " + resource + " ⛏️");
}

@Override
    public Explorable getNextTarget(){
        return new Asteroid("Next-" + name, distanceAU + 0.5,
                temperature, planetType);
}

@Override
    public int compareTo(Asteroid other){
        return Double.compare(this.distanceAU, other.distanceAU);
}
}
