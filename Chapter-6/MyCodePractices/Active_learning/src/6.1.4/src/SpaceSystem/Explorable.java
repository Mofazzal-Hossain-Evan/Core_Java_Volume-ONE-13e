package SpaceSystem;

public non-sealed interface Explorable
        extends SpaceBehavior {

    void explore(String astronaut);
    void land(int seconds);
    Explorable getNextTarget();

    // =====================
    // 6.1.4 — Static Methods
    // =====================
    // object লাগে না — Explorable.fromName() এভাবে ডাকো

    static String classify(double distanceAU) {
        return getZone(distanceAU);
    }

    static boolean isHabitable(double temperature) {
        return checkTemp(temperature);
    }

    static Explorable fromName(String name) {
        return switch (name.toLowerCase()) {
            case "mars"  -> new Planet("Mars",     1.52, -60.0, "Rocky");
            case "europa"-> new IcePlanet("Europa",5.2,  -160.0,"Icy");
            default      -> new Planet(name,       1.0,  15.0,  "Unknown");
        };
    }

    // =====================
    // 6.1.4 — Private Static Methods
    // =====================
    // static method এর helper — বাইরে দেখা যায় না

    private static boolean checkTemp(double t) {
        return t >= -50 && t <= 50;
    }

    private static String getZone(double d) {
        if (d < 1.5)       return "Inner Zone";
        else if (d < 5.0)  return "Habitable Zone";
        else               return "Outer Zone";
    }
}