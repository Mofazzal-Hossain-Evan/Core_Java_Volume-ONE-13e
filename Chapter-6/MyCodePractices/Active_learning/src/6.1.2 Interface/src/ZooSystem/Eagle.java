package ZooSystem;

public final class Eagle extends Animal{


    public Eagle(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void getAnimalType() {

    }

    @Override
    public int fly(int altitude) {
        return 0;
    }

    @Override
    public int swim(int depth) {
        return 0;
    }

    @Override
    public boolean eat() {
        return false;
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public String getHabitat() {
        return "";
    }

    @Override
    public int run(int speed) {
        return 0;
    }

    @Override
    public void run() {

    }
}
