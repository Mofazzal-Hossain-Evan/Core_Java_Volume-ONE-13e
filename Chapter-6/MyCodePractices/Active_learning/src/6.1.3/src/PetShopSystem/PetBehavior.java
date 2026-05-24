package PetShopSystem;

public sealed interface PetBehavior permits Trainable, Pet {
    String getSpecies();
}
