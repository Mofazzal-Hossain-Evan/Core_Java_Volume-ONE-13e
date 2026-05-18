package NatureBugSystem;

public class BugSystem {

    public static void main(String[] args) {
        BugStore Bug_Store = new BugStore();
        Bug[] bugs = Bug_Store.getBug();
        System.out.println("Total bugs "+ bugs.length);
        System.out.println();

        // =========================
        // 1. Interface Variable
        // =========================
        // new Livable() করা যায় না — ফর্মকে চেয়ারে বসানো যায় না!
        // কিন্তু variable declare করা যায়, আর implement করা object রাখা যায়।

        System.out.println("=== 1. Interface Variable ===");
        Livable l1 = new Bee("Bumble", 1, 0.1, "Garden");
        Livable l2 = new Butterfly("Raja", 2, 0.05, "Forest");

        l1.eat("Honey", 2.0);
        l1.sleep(7);
        l2.eat("Nectar", 1.5);
        l2.sleep(5);
        System.out.println();

        // =========================
        // 2. instanceof check
        // =========================
        // class check আর interface check — syntax একই।

        System.out.println("=== 2. instanceof Check ===");

        for (Bug b : bugs){
            if (b instanceof Flyable){
                System.out.println(b.getName() + " is Flyable ✔");
            }
            if (b instanceof Swimmable){
                System.out.println(b.getName() + " is Crawlable ✔");
            }
            if (b instanceof Crawlable){
                System.out.println(b.getName() + " is Crawlable ✔");
            } if (b instanceof Diggable){
                System.out.println(b.getName() + " is Diggable ✔");
            }
        }
        System.out.println();
        // =========================
        // 3. Interface Polymorphism
        // =========================
        // একই variable — আলাদা object। দুটোই Flyable তাই দুটোই চলে।

        System.out.println("=== 3. Interface Polymorphism ===");

        Flyable f1 = new Butterfly("Raja", 2, 0.05, "Forest");
        Flyable f2 = new Bee("Bumble", 1, 0.1, "Garden");

        f1.fly(200);
        f2.fly(200);

        System.out.println();

        // =========================
        // 4. Constant check
        // =========================
        // MAX_ALT = 500 — public static final।
        // Interface এ লেখা, কেউ বদলাতে পারবে না।

        System.out.println("=== 4. Constant Check ===");
        double safeAlt = 300;
        double dangerAlt = 600;

        if (safeAlt > Flyable.MAX_ALT){
            System.out.println(safeAlt +"m — Too High! ❌" );
        } else {
            System.out.println(safeAlt + "m — Safe ✔");
        }
        if (dangerAlt > Flyable.MAX_ALT){
            System.out.println(dangerAlt + "m — Too High! ❌");
        } else{
            System.out.println(dangerAlt + "m — Safe ✔");
        }
        System.out.println("MAX_ALT   = " + Flyable.MAX_ALT);
        System.out.println("MAX_DEPTH = " + Swimmable.MAX_DEPTH);
        System.out.println("MAX_SPEED = " + Crawlable.MAX_SPEED);

        System.out.println();

        // =========================
        // 5. Multiple implements
        // =========================
        // WaterBeetle — Crawlable আর Swimmable দুটোই।
        // Employee implements Cloneable, Comparable — textbook এর মতো।

        System.out.println("=== 5. Multiple Implements (WaterBeetle) ===");
        WaterBeetle wb = new WaterBeetle("Diver", 1, 0.3, "Pond");
        wb.eat("Algae", 0.5);
        wb.crawl(5);
        wb.swim(2);
        System.out.println();

        // =========================
        // 6. Sealed Interface
        // =========================
        // BugBehavior = sealed। শুধু Livable আর Bug permit করা।
        // অন্য কেউ implement করতে এলে — compile error।

        System.out.println("=== 6. Sealed Interface ===");

        BugBehavior bb1 = new Bee("Bumble", 1, 0.1, "Garden");
        BugBehavior bb2 = new Butterfly("Raja", 2, 0.05, "Forest");

        System.out.println("Bee habitat:       " + bb1.getHabitat());
        System.out.println("Butterfly habitat: " + bb2.getHabitat());

        System.out.println("bb1 instanceof BugBehavior: " + (bb1 instanceof BugBehavior));
        System.out.println("bb2 instanceof BugBehavior: " + (bb2 instanceof BugBehavior));

        System.out.println();

        // =========================
        // 6b. Comparable variable — textbook section 6.1.2 এ আছে
        // =========================
        // Comparable x; — variable declare।
        // x = new Employee() — implement করা object রাখা।
        // এটা property 1 এরই extension।

        System.out.println("=== 6b. Comparable Variable ===");

        Comparable<Bee> c1 = new Bee("Bumble", 1, 0.1, "Garden");
        Comparable<Bee> c2 = new Bee("Queen",  3, 0.3, "Hive");

        int result = c1.compareTo((Bee) c2);

        if (result > 0) {
            System.out.println("c1 is heavier");
        } else if (result < 0) {
            System.out.println("c1 is lighter");
        } else {
            System.out.println("equal weight");
        }

        System.out.println();

        // =========================
        // 7. Pattern Matching instanceof  — Java 16+
        // =========================
        // পুরনো: check করো, তারপর আলাদা করে cast করো।
        // নতুন: instanceof Flyable f — check আর capture একসাথে।

        System.out.println("=== 7. Pattern Matching instanceof ===");

        Object[] mixed = {
                new Butterfly("Raja",    2, 0.05, "Forest"),
                new Bee("Bumble",        1, 0.1,  "Garden"),
                new Ant("Worker",        1, 0.01, "Soil"),
                new WaterBeetle("Diver", 1, 0.3,  "Pond"),
                "Random String",
                42,
                true
        };

        for (Object item : mixed) {
            if (item instanceof Flyable f) {
                f.fly(100);
            } else if (item instanceof Crawlable c) {
                c.crawl(10);
            } else if (item instanceof Comparable<?> comp) {
                System.out.println("Comparable found: "
                        + item.getClass().getSimpleName()
                        + " → " + item);
            } else {
                System.out.println("Unknown item → " + item);
            }
        }

        System.out.println();
        System.out.println("=== Section 6.1.2 — All properties covered! ===");
    }
}



