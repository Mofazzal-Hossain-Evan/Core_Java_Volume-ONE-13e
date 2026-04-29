package Animal;

public record FlyingBirdsStore() {

    private static final Flying_Birds[] FB = {
            new Flying_Birds("Parrot", 2, "Green", "Squawk", true),
            new Flying_Birds("Sparrow", 1, "Brown", "Chirp", true),
            new Flying_Birds("Eagle", 5, "Dark Brown", "Screech", true),
            new Flying_Birds("Pigeon", 3, "Gray", "Coo", true),
            new Flying_Birds("Crow", 4, "Black", "Caw", true)
    };

    public Flying_Birds[] getFB() {
        return FB;
    }
}