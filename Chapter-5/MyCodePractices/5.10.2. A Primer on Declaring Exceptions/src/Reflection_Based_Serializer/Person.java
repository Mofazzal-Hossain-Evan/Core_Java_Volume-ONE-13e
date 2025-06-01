package Reflection_Based_Serializer;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Person friend;
    private String[] hobbies;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setFriend(Person friend){
        this.friend = friend;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
