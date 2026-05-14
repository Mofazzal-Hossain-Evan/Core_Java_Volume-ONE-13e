package ZooSystem;

public  class Shark extends Animal
implements Swimmable, Comparable<Shark>{
    public Shark() {
    }

    public Shark(String name, int age, double weight, String habitat) {
    }

    @Override
    void getAnimalType() {

    }


    @Override
    public int fly(int alt) {
        return alt;
    }

    @Override
    public void swim(double depth) {

    }

    @Override
    public void eat(String food, double kg) {

    }

    @Override
    public void sleep(int sleep) {

    }

    @Override
    public String getHabitat() {
        return "";
    }

    @Override
    public void run(double speed) {

    }

    @Override
    public int compareTo(Shark o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
