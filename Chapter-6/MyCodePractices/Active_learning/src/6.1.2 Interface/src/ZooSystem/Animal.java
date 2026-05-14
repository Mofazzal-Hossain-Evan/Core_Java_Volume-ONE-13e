package ZooSystem;

public abstract class Animal implements Flyable , Swimmable, Runnerable{

    int name;
    int age;
    double weight;
    String habit;

    public Animal() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habit = habit;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }


   abstract void getAnimalType();

}

