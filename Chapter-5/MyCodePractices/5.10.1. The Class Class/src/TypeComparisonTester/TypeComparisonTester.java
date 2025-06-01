package TypeComparisonTester;

public class TypeComparisonTester  {
    public static void main(String[] args) {

        Animal a = new Dog();
        Animal b = new Cat();


        System.out.println("a instanceof Animal: " + (a instanceof Animal)); // ✅ true
        System.out.println("b instanceof Dog: " + (b instanceof Dog));       // ✅ false

        // getClass() দিয়ে exact class check
        System.out.println("a.getClass() == Dog.class: " + (a.getClass() == Dog.class)); // ✅ true
        System.out.println("b.getClass() == Animal.class: " + (b.getClass() == Animal.class)); // ❌ false
    }


}
