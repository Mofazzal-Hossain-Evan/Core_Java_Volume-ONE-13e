package PetShopSystem;

public abstract non-sealed class Pet implements PetBehavior {

    String name;
    int age;
    double price;
    String species;

    public Pet(String name, int age, double price, String species) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    public abstract String getPetType() ;


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", species='" + species + '\'' +
                '}';
    }
}
