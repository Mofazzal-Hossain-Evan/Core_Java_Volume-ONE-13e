package equalityProject.strict;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 50000, "2020-01-01");
        Employee e2 = new Employee("Alice", 50000, "2020-01-01");
        Manager m1 = new Manager("Alice", 50000, "2020-01-01", 10000);
        Manager m2 = new Manager("Alice", 50000, "2020-01-01", 15000);

        System.out.println("e1.equals(e2): " + e1.equals(e2)); // true
        System.out.println("e1.equals(m1): " + e1.equals(m1)); // false
        System.out.println("m1.equals(e1): " + m1.equals(e1)); // false
        System.out.println("m1.equals(m2): " + m1.equals(m2)); // false

        Set<MyObject> staff = new HashSet<>();
        staff.add(e1);
        staff.add(e2);
        staff.add(m1);
        staff.add(m2);

        System.out.println("\n--- HashSet Content ---");

        for (MyObject obj : staff){
            System.out.println(obj);
        }
        System.out.println("Set size: " + staff.size());
    }
}
