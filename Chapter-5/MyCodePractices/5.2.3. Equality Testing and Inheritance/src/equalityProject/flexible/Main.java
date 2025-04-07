package equalityProject.flexible;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Bob", 50000, "2020-01-01");
        Manager m1 = new Manager("Bob", 50000, "2020-01-01", 10000);
        Manager m2 = new Manager("Bob", 50000, "2020-01-01", 10000);

        System.out.println("e1.equals(m1): " + e1.equals(m1)); // ✅ true (allowed)
        System.out.println("m1.equals(e1): " + m1.equals(e1)); // ✅ true (symmetry OK)

        System.out.println("m1.equals(m2): " + m1.equals(m2)); // ✅ true

        Set<MyObject> people = new HashSet<>();
        people.add(e1);
        people.add(m1);
        people.add(m2);

        System.out.println("\n-----Set Content-----");
        for (MyObject obj : people){
            System.out.println(obj);
        }
        System.out.println("Set size: "+ people.size());
    }
}
