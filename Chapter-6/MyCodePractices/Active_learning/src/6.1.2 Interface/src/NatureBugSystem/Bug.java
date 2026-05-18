package NatureBugSystem;

public abstract non-sealed class Bug
        implements Flyable, Swimmable, Crawlable, Diggable, BugBehavior {
    String name;
    int age;
    double weight;
    String habitat;

    public Bug(String name, int age, double weight, String habitat) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "name=" + name +
                ", age=" + age +
                ", weight=" + weight +
                ", habitat='" + habitat + '\'' +
                '}';
    }
    abstract String getBugType();
    abstract String getBugName();
    abstract String getBugDescription();
}
