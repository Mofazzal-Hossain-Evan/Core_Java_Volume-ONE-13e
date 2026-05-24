package PetShopSystem;

public class Cat extends Pet
implements Cuddlable, Comparable<Cat>{

    public Cat(String name, int age, double price, String species) {
        super(name, age, price, species);
    }

    @Override
    public String getPetType() {
        return  "Cat";
    }


    @Override
    public void cuddle(int minutes) {

        if (minutes> MAX_CUDDLE){
            System.out.println(name + " scratches you! MAX = " + MAX_CUDDLE + " mins ❌");
        } else{
            System.out.println(name + " purring for " + minutes + " mins 😺");
        }
    }

    @Override
    public void train(String trick) {
        System.out.println(name + " maybe learned: " + trick + " 🐈");
    }

    @Override
    public void feed(String food) {
        System.out.println(name + " eating " + food + " 🐟");
    }

    @Override
    public Trainable getJuniorVersion() {
        return new Cat("Kitten "+ name,0,price*4,species);
    }

    @Override
    public int compareTo(Cat o) {
        return Double.compare(this.price, o.price);
    }
}
