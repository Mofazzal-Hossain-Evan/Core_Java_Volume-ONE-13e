package SpaceSystem;

public class SpaceSystem {

    public static void main(String[] args) {

        SpaceStore store = new SpaceStore();
        SpaceObject[] objects = store.getObjects();

        System.out.println("Total objects: " + objects.length);
        System.out.println();

        // =========================
        // 1. Static Method — 6.1.4 ★
        // =========================
        // object লাগে না — Interface নামে সরাসরি ডাকো
        // আগে Companion Class লাগত — এখন আর লাগে না

        System.out.println("=== 1. Static Method (6.1.4) ===");

        String zone1 = Explorable.classify(1.52);
        String zone2 = Explorable.classify(5.20);
        String zone3 = Explorable.classify(9.50);

        System.out.println("Mars zone:   " + zone1);
        System.out.println("Europa zone: " + zone2);
        System.out.println("Titan zone:  " + zone3);

        boolean hab1 = Explorable.isHabitable(15.0);
        boolean hab2 = Explorable.isHabitable(-160.0);

        System.out.println("Earth habitable:  " + hab1);
        System.out.println("Europa habitable: " + hab2);

        Explorable fromName = Explorable.fromName("Mars");
        System.out.println("fromName: " + fromName);

        System.out.println();

        // =========================
        // 2. Private Method — 6.1.4 ★
        // =========================
        // isReadyToColonize() বাইরে দেখা যায়
        // ভেতরে private helper checkPopulation() কাজ করছে

        System.out.println("=== 2. Private Method (6.1.4) ===");

        Planet earth  = new Planet("Earth",  1.00, 15.0,  "Rocky");
        Planet mars   = new Planet("Mars",   1.52, -60.0, "Rocky");

        System.out.println("Earth ready(500):  " + earth.isReadyToColonize(500));
        System.out.println("Earth ready(2000): " + earth.isReadyToColonize(2000));
        System.out.println("Mars ready(100):   " + mars.isReadyToColonize(100));

        System.out.println();

        // =========================
        // 3. Interface Variable — 6.1.2
        // =========================
        System.out.println("=== 3. Interface Variable (6.1.2) ===");

        Explorable e1 = new Planet("Earth",  1.00, 15.0,  "Rocky");
        Explorable e2 = new Asteroid("Ceres",2.77, -105.0,"Dwarf");

        e1.explore("Neil");
        e2.explore("Buzz");

        System.out.println();

        // =========================
        // 4. instanceof check — 6.1.2
        // =========================
        System.out.println("=== 4. instanceof Check (6.1.2) ===");

        for (SpaceObject obj : objects) {
            if (obj instanceof Habitable) {
                System.out.println(obj.getName() + " is Habitable 🏘️");
            }
            if (obj instanceof Mineable) {
                System.out.println(obj.getName() + " is Mineable ⛏️");
            }
            if (obj instanceof Observable) {
                System.out.println(obj.getName() + " is Observable 🔭");
            }
        }

        System.out.println();

        // =========================
        // 5. Polymorphism — 6.1.2
        // =========================
        System.out.println("=== 5. Polymorphism (6.1.2) ===");

        Explorable ex1 = new Planet("Venus",   0.72, 462.0,  "Rocky");
        Explorable ex2 = new StarBase("Alpha", 4.50, -200.0, "Station");

        ex1.explore("Yuri");
        ex2.explore("Valentina");

        System.out.println();

        // =========================
        // 6. Constant check — 6.1.2
        // =========================
        System.out.println("=== 6. Constant Check (6.1.2) ===");

        int safePop   = 500;
        int dangerPop = 1500;

        if (safePop > Habitable.MAX_POP) {
            System.out.println(safePop + " — Too many! ❌");
        } else {
            System.out.println(safePop + " — OK ✔");
        }

        if (dangerPop > Habitable.MAX_POP) {
            System.out.println(dangerPop + " — Too many! ❌");
        } else {
            System.out.println(dangerPop + " — OK ✔");
        }

        System.out.println("MAX_POP  = " + Habitable.MAX_POP);
        System.out.println("MAX_RES  = " + Mineable.MAX_RES);
        System.out.println("MAX_DIST = " + Observable.MAX_DIST);

        System.out.println();

        // =========================
        // 7. Multiple implements — 6.1.3
        // =========================
        System.out.println("=== 7. Multiple Implements (6.1.3) ===");

        IcePlanet europa = new IcePlanet("Europa", 5.20, -160.0, "Icy");
        europa.colonize(50);
        europa.mine("Ice");
        europa.explore("Astronaut Kim");

        System.out.println();

        // =========================
        // 8. Sealed interface — 6.1.2
        // =========================
        System.out.println("=== 8. Sealed Interface (6.1.2) ===");

        SpaceBehavior sb1 = new Planet("Earth",   1.00, 15.0,   "Rocky");
        SpaceBehavior sb2 = new IcePlanet("Titan",9.50, -179.0, "Icy");

        System.out.println("Earth type: "  + sb1.getPlanetType());
        System.out.println("Titan type: "  + sb2.getPlanetType());
        System.out.println("sb1 instanceof SpaceBehavior: "
                + (sb1 instanceof SpaceBehavior));

        System.out.println();

        // =========================
        // 9. Comparable variable — 6.1.2
        // =========================
        System.out.println("=== 9. Comparable Variable (6.1.2) ===");

        Comparable<Planet> cp1 = new Planet("Mars",  1.52, -60.0, "Rocky");
        Comparable<Planet> cp2 = new Planet("Venus", 0.72, 462.0, "Rocky");

        int result = cp1.compareTo((Planet) cp2);

        if (result > 0) {
            System.out.println("cp1 is farther");
        } else if (result < 0) {
            System.out.println("cp1 is closer");
        } else {
            System.out.println("same distance");
        }

        System.out.println();

        // =========================
        // 10. Pattern matching — 6.1.2
        // =========================
        System.out.println("=== 10. Pattern Matching (6.1.2) ===");

        Object[] mixed = {
                new Planet("Earth",    1.00, 15.0,   "Rocky"),
                new Asteroid("Ceres",  2.77, -105.0, "Dwarf"),
                new StarBase("Alpha",  4.50, -200.0, "Station"),
                new IcePlanet("Europa",5.20, -160.0, "Icy"),
                "Random String",
                42
        };

        for (Object item : mixed) {
            if (item instanceof Habitable h) {
                h.colonize(100);
            } else if (item instanceof Mineable m) {
                m.mine("Iron");
            } else if (item instanceof Observable o) {
                o.observe("Telescope");
            } else if (item instanceof Comparable<?>) {
                System.out.println("Comparable: "
                        + item.getClass().getSimpleName());
            } else {
                System.out.println("Unknown → " + item);
            }
        }

        System.out.println();

        // =========================
        // 11. CharSequence idea — 6.1.3
        // =========================
        System.out.println("=== 11. CharSequence Idea (6.1.3) ===");

        // Part A — Universal Remote
        System.out.println("--- Part A: Universal Remote ---");
        showObjectInfo(new Planet("Mars",     1.52, -60.0,  "Rocky"));
        showObjectInfo(new Asteroid("Vesta",  2.36, -110.0, "Rocky"));
        showObjectInfo(new StarBase("Omega",  6.00, -220.0, "Station"));
        showObjectInfo(new IcePlanet("Titan", 9.50, -179.0, "Icy"));

        System.out.println();

        // Part B — subSequence idea
        System.out.println("--- Part B: subSequence idea ---");

        Explorable planet   = new Planet("Earth",   1.00, 15.0,   "Rocky");
        Explorable asteroid = new Asteroid("Ceres", 2.77, -105.0, "Dwarf");
        Explorable ice      = new IcePlanet("Europa",5.20,-160.0, "Icy");

        Explorable nextPlanet   = planet.getNextTarget();
        Explorable nextAsteroid = asteroid.getNextTarget();
        Explorable nextIce      = ice.getNextTarget();

        nextPlanet.explore("Astronaut A");
        nextAsteroid.explore("Astronaut B");
        nextIce.explore("Astronaut C");

        System.out.println();
        System.out.println("=== 6.1.4 + 6.1.3 + 6.1.2 — All covered! ===");
    }

    // CharSequence Universal Remote idea
    public static void showObjectInfo(Explorable e) {
        System.out.println("--- Object Info ---");
        e.explore("Mission Control");
        e.land(30);
    }
}