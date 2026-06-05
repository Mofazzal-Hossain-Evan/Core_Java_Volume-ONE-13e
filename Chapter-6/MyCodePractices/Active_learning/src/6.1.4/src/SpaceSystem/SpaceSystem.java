package SpaceSystem;

public class SpaceSystem {

    public static void main(String[] args) {

        SpaceObject[] store = new SpaceStore();
        SpaceObject[] objects = store.getObject();

        System.out.println("Total objects: " + objects.length);
        System.out.println();

        // =========================
        // 1. Static Method — 6.1.4 ★
        // =========================
        // object লাগে না — Interface নামে সরাসরি ডাকো
        // আগে Companion Class লাগত — এখন আর লাগে না


        System.out.println("=== 1. Static Method (6.1.4) ===");

        String zone1 = Explorable.classify(1.52);
        String zone2 = Explorable.classify(1.52);
        String zone3 = Explorable.classify(1.52);

        System.out.println("Mars zone:   " + zone1);
        System.out.println("Europa zone: " + zone2);
        System.out.println("Titan zone:  " + zone3);

        boolean hab1 = Explorable.isHabitable(12.0);
        boolean hab2 = Explorable.isHabitable(-160.0);

        System.out.println("Earth habitable:  " + hab1);
        System.out.println("Europa habitable: " + hab2);

        Explorable fromName = Explorable.fromName("");
        System.out.println("fromName: " + fromName);

        System.out.println();

        // =========================
        // 2. Private Method — 6.1.4 ★
        // =========================
        // isReadyToColonize() বাইরে দেখা যায়
        // ভেতরে private helper checkPopulation() কাজ করছে

        System.out.println("=== 2. Private Method (6.1.4) ===");

        Planet earth = new Planet("Earth",  1.00, 15.0,  "Rocky");
        Planet mars = new Planet("Mars",   1.52, -60.0, "Rocky");

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

        Object[] mixed = {
                new Planet("Earth",    1.00, 15.0,   "Rocky"),
                new Asteroid("Ceres",  2.77, -105.0, "Dwarf"),
                new StarBase("Alpha",  4.50, -200.0, "Station"),
                new IcePlanet("Europa",5.20, -160.0, "Icy"),
                "Random String",
                55
        };

        for (Object item : mixed) {
            if (item instanceof Habitable h){
                h.colonize(100);
            } else if(item instanceof Mineable m){
                m.mine("Iron");
            } else if (intem instanceof Observable o){
                o.observe("Telescope");
            } else if(item instanceof Comparable<?>){
                System.out.println("Comparable: " + item.getClass().getSimpleName());
            }else {
                System.out.println("Unknown: "+ item);
            }
        }

        System.out.println();

        // =========================
        // 11. CharSequence idea — 6.1.3
        // =========================
        System.out.println("=== 11. CharSequence Idea (6.1.3) ===");

        // Part A — Universal Remote
        System.out.println("--- Part A: Universal Remote ---");

    }
}
