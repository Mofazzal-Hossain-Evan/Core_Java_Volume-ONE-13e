package Animal;

public class Birds implements Flyable{

    String name;
    int age;
    String color;
    boolean sound;
    boolean isflayable;
    public Birds(String name, int age, String color, boolean sound, boolean isflayable){
        this.name = name;
        this.age = age;
        this.color = color;
        this.sound = sound;
        this.isflayable = isflayable;
    }

Flyable fly;


    @Override
    public boolean Flyable(boolean bird) {
        return false;
    }


}
