package PetShopSystem;

public class PetStore {
  private   Pet[] pets;

    public PetStore(Pet[] pets) {
        this.pets = pets;
    }

    public PetStore(){
        pets = new Pet[]{
                // Dogs
                new Dog("Bruno",   3, 500.0,  "Labrador"),
                new Dog("Max",     2, 450.0,  "Bulldog"),
                new Dog("Rocky",   4, 600.0,  "German Shepherd"),

                // Cats
                new Cat("Whiskers", 2, 300.0, "Persian"),
                new Cat("Luna",     1, 250.0, "Siamese"),
                new Cat("Mochi",    3, 400.0, "Maine Coon"),

                // Tigers
                new Tiger("Shere Khan", 5, 5000.0, "Bengal"),
                new Tiger("Rajah",      3, 4500.0, "Siberian")
        };
    }
    public Pet[] getPets(){
        return pets;
    }
}
