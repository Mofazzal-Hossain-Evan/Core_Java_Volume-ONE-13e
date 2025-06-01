package UniversityPeopleEquality;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person s1 = new Student("NID123", "Ayesha", "CSE");
                Person p1 = new Professor("NID123", "Ayesha", "CSE");
                Person a1 = new Admin("NID456", "Karim", "Finance");

        System.out.println( "s1.equals(p1)? "+ s1.equals(p1));
        System.out.println("s1.equals(a1)? "+s1.equals(a1));

        // HashSet test
        Set<Person> registry = new HashSet<>();
        registry.add(s1);
        registry.add(a1);
        registry.add(p1);

        System.out.println("\nRegistry:");
        for (Person person : registry){
            System.out.println(person);
        }
        CustomObject o1 = new CustomObject(101);
        CustomObject o2 = new CustomObject(201);
        CustomObject o3 = new CustomObject(201);

        System.out.println("\no1.isEqualTo(o2)? " + o1.isEqualTo(o2));
        System.out.println("o1.isEqualTo(o3)? " + o2.isEqualTo(o3));
        System.out.println("o1.customHashCode(): "+ o1.customHashCode());

    }
}
