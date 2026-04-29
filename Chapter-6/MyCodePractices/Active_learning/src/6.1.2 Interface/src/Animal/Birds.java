package Animal;

public class Birds {

    public static void main(String[] args) {
        FlyingBirdsStore flyingStore = new FlyingBirdsStore();
        NonFlyingBirdsStore nonFlyingStore = new NonFlyingBirdsStore();

        Flying_Birds[] flyingBirds = flyingStore.getFB();
        Non_Flying_Birds[] nonFlyingBirds = nonFlyingStore.getNFB();

        System.out.println("=== Flying Birds ===");
        for (Flying_Birds bird : flyingBirds) {
            System.out.println(bird.getName() + " | " +
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
    }
}