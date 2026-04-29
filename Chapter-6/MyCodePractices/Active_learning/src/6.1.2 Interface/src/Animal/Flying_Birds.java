package Animal;

public class Flying_Birds {

    String name;
    int age;
    String color;
    String sound;
    boolean isFlyable;

    public Flying_Birds(String name, int age, String color, String sound, boolean isFlyable) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sound = sound;
        this.isFlyable = isFlyable;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getColor() { return color; }
    public String getSound() { return sound; }
    public boolean isFlyable() { return isFlyable; }
}