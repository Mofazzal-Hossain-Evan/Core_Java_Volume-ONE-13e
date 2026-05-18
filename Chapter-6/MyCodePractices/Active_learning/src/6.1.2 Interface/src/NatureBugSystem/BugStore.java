package NatureBugSystem;

public class BugStore {

    Bug[] bugs;
    public BugStore() {
        bugs = new Bug[]{


// 🦋 Butterfly × 3
                new Butterfly("Raja", 1, 0.5, "Garden"),
                new Butterfly("Monarch", 2, 0.6, "Forest"),
                new Butterfly("Sunny", 1, 0.55, "Flowers"),

// 🐝 Bee × 3
                new Bee("Bumble", 4, 0.3, "Hive"),
                new Bee("Honey", 5, 0.35, "Garden"),
                new Bee("Queen", 6, 0.4, "Forest"),

// 🐜 Ant × 3
                new Ant("Worker", 7, 0.2, "Soil"),
                new Ant("Soldier", 8, 0.25, "Hill"),
                new Ant("Tiny", 9, 0.22, "Ground"),

// 🪲 WaterBeetle × 2
                new WaterBeetle("Diver", 10, 0.8, "Pond"),
                new WaterBeetle("Splash", 11, 0.9, "Lake")


        };
    }
    public Bug[] getBug() {
            return bugs;
        }
}
