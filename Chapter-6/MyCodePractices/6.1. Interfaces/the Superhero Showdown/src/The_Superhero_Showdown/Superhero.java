package The_Superhero_Showdown;

public class Superhero implements Comparable<Superhero> {

    private String name;
    private int powerLevel;
    private double speed;
    private String team;

    public Superhero(String name, int powerLevel, double speed, String team) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.speed = speed;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public double getSpeed() {
        return speed;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public int compareTo(Superhero other) {
        int powerComparison = Integer.compare(this.powerLevel, other.powerLevel);

        return powerComparison != 0 ? powerComparison : this.name.compareTo(other.name);
        // "যদি দুটি অবজেক্টের power সমান না হয়, তাহলে সেই পার্থক্য অনুযায়ী রিটার্ন করো। কিন্তু যদি power সমান হয়,
        // তাহলে name অনুযায়ী তুলনা করে রিটার্ন করো (টায় ব্রেক করার জন্য)।"
    }

    // Override toString for readable output
    @Override
    public String toString() {
        return String.format("Name: %s, Power: %d, Speed: %.1f, Team: %s",
                name, powerLevel, speed, team);
    }
}