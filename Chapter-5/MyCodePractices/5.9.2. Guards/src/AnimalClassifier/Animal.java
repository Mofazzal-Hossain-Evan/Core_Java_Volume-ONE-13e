package AnimalClassifier;

sealed interface Animal permits Mammal, Bird, Reptile {
    String name();
}
