package Reflection_Based_Serializer;

public class Main {
    public static void main(String[] args) {
        try {
            Person alice = new Person("Alice", 30);
            alice.setHobbies(new String[]{"reading", "gaming"});

            Person bob = new Person("Bob", 25);
            alice.setFriend(bob);

            String serialized = ReflectionSerializers.serialize(alice);
            System.out.println("Serialized: " + serialized);

            Object deserialized = ReflectionSerializers.deserialize(serialized);
            System.out.println("Deserialized: " + deserialized);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
