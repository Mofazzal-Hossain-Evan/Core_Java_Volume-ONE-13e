package AnimalClassifier;

public class AnimalClassifier {
    public static void main(String[] args) {
        Animal[] animals = {
                new Mammal("Bat", true),
                new Mammal("Elephant", false),
                new Bird("Penguin", false, true),
                new Bird("Eagle", true, false),
                new Reptile("Cobra", true),
                new Reptile("Iguana", false)
        };
    }
}
