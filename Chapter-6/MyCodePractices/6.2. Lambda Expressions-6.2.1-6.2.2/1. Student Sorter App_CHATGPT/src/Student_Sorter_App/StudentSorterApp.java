package Student_Sorter_App;

import java.util.*;

public class StudentSorterApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 3.5));
        students.add(new Student("Bob", 20, 3.9));
        students.add(new Student("Charlie", 23, 3.2));
        students.add(new Student("Diana", 21, 3.7));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // নাম দিয়ে sort
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // বয়স দিয়ে sort
        Collections.sort(students, (s1, s2) -> s1.age - s2.age);
        System.out.println("\nSorted by Age:");
        students.forEach(System.out::println);

        // গ্রেড দিয়ে sort (descending order)
        Collections.sort(students, (s1, s2) -> Double.compare(s2.grade, s1.grade));
        System.out.println("\nSorted by Grade (highest first):");
        students.forEach(System.out::println);
    }
}
