package VirtualPetAdoption;

public class Main {
    public static void main(String[] args) {

        Pet dog1 = new Dog("Buddy", "Brown", 3);
        Pet dog2 = new Dog("Buddy", "Brown", 5); // বয়স আলাদা কিন্তু নাম ও প্রজাতি একই
        Pet cat1 = new Cat("Whiskers", "White", 2);
        Pet parrot = new Parrot("Polly",  1);

        System.out.println("dog1 equals dog2? " + dog1.equals(dog2)); // ✅ true
        System.out.println("dog1 equals cat1? " + dog1.equals(cat1)); // ❌ false
        System.out.println("cat1 equals parrot? " + cat1.equals(parrot)); // ❌ false

        System.out.println("\nDetails:");
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(parrot);
    }
}
