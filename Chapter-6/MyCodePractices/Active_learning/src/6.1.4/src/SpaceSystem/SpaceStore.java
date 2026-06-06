package SpaceSystem;

import java.security.PublicKey;

public class SpaceStore {
    private SpaceObject[] objects;

    public SpaceStore() {
        this.objects = new SpaceObject[]{

                // Planets
                new Planet("Mars",    1.52, -60.0,  "Rocky"),
                new Planet("Venus",   0.72, 462.0,  "Rocky"),
                new Planet("Earth",   1.00, 15.0,   "Rocky"),

                // Asteroids
                new Asteroid("Ceres",  2.77, -105.0, "Dwarf"),
                new Asteroid("Vesta",  2.36, -110.0, "Rocky"),
                new Asteroid("Pallas", 2.77, -100.0, "Rocky"),

                // StarBases
                new StarBase("Alpha",  4.50, -200.0, "Station"),
                new StarBase("Omega",  6.00, -220.0, "Station"),

                // IcePlanets
                new IcePlanet("Europa", 5.20, -160.0, "Icy"),
                new IcePlanet("Titan",  9.50, -179.0, "Icy")
        };
    }

    public SpaceObject[] getObjects() {
        return objects;
    }
}
