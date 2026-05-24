package PetShopSystem;

public final class Dog extends Pet
        implements Cuddlable, Comparable<Dog> {

    public Dog(String name, int age,
               double price, String species) {
        super(name, age, price, species);
    }

    @Override
    public String getPetType() { return "Dog"; }

    @Override
    public void train(String trick) {
        System.out.println(name + " learned: " + trick + " 🐕");
    }



    @Override
    public void feed(String food) {
        System.out.println(name + " eating " + food + " 🦴");
    }

    @Override
    public void cuddle(int minutes) {
        if (minutes > MAX_CUDDLE) {
            System.out.println(name + " is tired! MAX = " + MAX_CUDDLE + " mins ❌");
        } else {
            System.out.println(name + " cuddling for " + minutes + " mins 🐾");
        }
    }

    // CharSequence subSequence idea
    // getJuniorVersion() → Trainable return করে
    // subSequence() → CharSequence return করে — same idea
    @Override
    public Trainable getJuniorVersion() {

        return new Dog("Junior " + name, 0, price * 0.5, species);
    }

    @Override
    public int compareTo(Dog other) {

        return Double.compare(price, other.price);
    }


}