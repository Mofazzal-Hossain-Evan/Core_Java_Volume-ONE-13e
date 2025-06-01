package AnimalClassifier;

public record Mammal(String name, boolean canFly) implements Animal { }
record Bird(String name, boolean canFly, boolean canSwim) implements Animal {}
record Reptile(String name, boolean isVenomous) implements Animal {}


