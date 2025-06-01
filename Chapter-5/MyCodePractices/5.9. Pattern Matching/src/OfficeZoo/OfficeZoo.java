package OfficeZoo;

public class OfficeZoo {

    public static String describe(Employee e){
        return switch (e){
            case Manager m -> "🦁 " + m.getAnimal() + " says: " + m.getCatchphrase();
            case Executive exec -> "🐍 " + exec.getAnimal() + " hisses: " + exec.getCatchphrase();
            case Intern i -> "🐒 " + i.getAnimal() + " screams: " + i.getCatchphrase();
            case Clerk c -> "🐢 " + c.getAnimal() + " whispers: " + c.getCatchphrase();
            case Employee __ -> "An unknown employee shuffles by quietly...";
            
        };
    }

    public static void main(String[] args) {
        Employee[] zoo = {
                new Manager(),
                new Executive(),
                new Intern(),
                new Clerk(),
             //   new Employee() {} // anonymous class to test default
        };

        for (Employee e : zoo) {
            System.out.println(describe(e));
        }
    }
}
