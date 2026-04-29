package Animal;

public record NonFlyingBirdsStore() {

    private static final Non_Flying_Birds[] NFB = {
            new Non_Flying_Birds("Ostrich", 6, "Black & White", "Boom", false),
            new Non_Flying_Birds("Penguin", 4, "Black & White", "Honk", false),
            new Non_Flying_Birds("Kiwi", 3, "Brown", "Squeak", false)
    };

    public Non_Flying_Birds[] getNFB() {
        return NFB;
    }
}