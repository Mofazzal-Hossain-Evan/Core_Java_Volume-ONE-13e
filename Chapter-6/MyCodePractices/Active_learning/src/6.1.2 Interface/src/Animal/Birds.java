package Animal;

public class Birds {

    public static void main(String[] args) {

        FlyingBirdsStore flyingStore = new FlyingBirdsStore();
        NonFlyingBirdsStore nonFlyingStore = new NonFlyingBirdsStore();

        Flying_Birds[] flyingBirds = flyingStore.getFB();
        Non_Flying_Birds[] nonFlyingBirds = nonFlyingStore.getNFB();

        System.out.println("=== Flying Birds ===");
        for (Flying_Birds bird : flyingBirds) {
            System.out.println(
                    bird.getName() + " | " +
                            bird.getAge() + " | " +
                            bird.getColor() + " | " +
                            bird.getSound()
            );
        }

        System.out.println("\n=== Non-Flying Birds ===");
        for (Non_Flying_Birds bird : nonFlyingBirds) {
            System.out.println(
                    bird.getName() + " | " +
                            bird.getAge() + " | " +
                            bird.getColor() + " | " +
                            bird.getSound()
            );
        }

        System.out.println("\n=== Interface + Sealed Practice ===");
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        sparrow.fly(500);
        sparrow.fly(900);
        System.out.println("Speed: "+ sparrow.speed());

        if (sparrow instanceof Flyable){
            System.out.println();
            System.out.println("Sparrow is Flyable ✔");
        }

        if (sparrow instanceof  SpeedFlyable){
            System.out.println();
            System.out.println("Sparrow is SpeedFlyable ✔");
        }

        Object obj = penguin;

        if (obj instanceof Flyable) {
            System.out.println("Penguin Can fly");
        } else {
            System.out.println("Cannot fly ❌");
        }

//        if (penguin instanceof BirdType){
//            System.out.println("Penguin can fly");
//        } else {
//            System.out.println("Penguin can not fly");
//        }

//Interface Polymorphism
        System.out.println("\n=== Interface Polymorphism ===");
        Flyable f1 = new Sparrow();
        Flyable Crow = new Flying_Birds("Crow", 3, "Black", "Caw", true);
        f1.fly(200);
        Crow.fly(150);

        // Mixed Object System
        System.out.println("\n=== Mixed Object System ===");
        Object[] zoo = {
                new Sparrow(),
                new Penguin(),
                new Flying_Birds("Parrot", 2, "Green", "Squawk", true),
                "Hello",
                42
        };
        //✔ process loop
        for (Object item : zoo) {
            if (item instanceof Flyable f){
                f.fly(100);
            } else if(item instanceof Comparable c){
                System.out.println("Comparable detected: " + item.getClass().getSimpleName());
            } else {
                System.out.println("Unknown item: " + item);
            }
        }

        // =========================
        // Interface hierarchy check and Behavior test
        // =========================

        Eagle eagle_Interface = new Eagle();
        System.out.println();
        System.out.println(eagle_Interface instanceof Eagle);
        System.out.println(eagle_Interface instanceof AdvancedFlyable);
        System.out.println();

        eagle_Interface.fly(100);
        System.out.println("Speed "+ eagle_Interface.flightSped());


        // =========================
        // Comparable practice
        // =========================

        Comparable<Flying_Birds> a;
        Comparable<Flying_Birds> b;

        Flying_Birds eagle = new Flying_Birds("Eagle", 5, "Brown", "Screech", true);
        Flying_Birds parrot = new Flying_Birds("Parrot", 2, "Green", "Squawk", true);

        a = eagle;
        int result = a.compareTo(parrot);
        System.out.println("\nEagle vs Parrot: " + result);

        b = parrot;
        int result2 = b.compareTo(eagle);
        System.out.println("Parrot vs Eagle: " + result2);

        // =========================
        // Generic method practice
        // =========================

        System.out.println();
        processData(eagle, parrot);
        processData(parrot, eagle);

        // =========================
        // instanceof (FIXED)
        // =========================

        System.out.println();

        if (eagle instanceof Comparable) {
            System.out.println("Eagle is Comparable ✔");
        }

        if (parrot instanceof Comparable) {
            System.out.println("Parrot is Comparable ✔");
        }

        System.out.println("\n=== Sound Test ===");
        Flying_Birds fb = new Flying_Birds("Crow", 4, "Black", "Caw", true);
        System.out.println();
        System.out.println(fb.makeSound());
    }

    // =========================
    // Generic method
    // =========================

    public static <T extends Comparable<T>> void processData(T a, T b) {

        int result = a.compareTo(b);

        if (result > 0) {
            System.out.println("a is big");
        } else if (result < 0) {
            System.out.println("b is big");
        } else {
            System.out.println("equal");
        }
    }
}