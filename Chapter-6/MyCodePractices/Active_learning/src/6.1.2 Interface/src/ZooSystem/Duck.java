package ZooSystem;

public  final class Duck extends Animal implements
Flyable, Swimmable, Comparable<Duck>
{
    public Duck() {
    }

    public Duck(String name, int age, double weight, String habitat) {
    }

    @Override
    void getAnimalType() {

    }

    @Override
    public void swim(double depth) {

    }

    @Override
    public int fly(int alt) {
        return 0;
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
    public int compareTo(Duck o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
