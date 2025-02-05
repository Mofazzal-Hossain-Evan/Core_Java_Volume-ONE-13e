package StudentManagerPro;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerPro {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Show All Students\n4. Exit");
            System.out.println("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> showAllStudents();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private static void addStudent(){
        System.out.print("enter student name: ");
        String name = input.nextLine();
        System.out.println("enter id: ");
        int id = input.nextInt();
        System.out.println("enter grade: ");
        double grade = input.nextDouble();
        System.out.println("added succesful");
    }

    private static void removeStudent(){
        System.out.println("enter id to remove ");
        int id = input.nextInt();
        students.removeIf(student -> student.getId() == id);
        System.out.println("removed ");
    }

    private static void showAllStudents(){
        if(students.isEmpty()) {
            System.out.println("no student here");
        } else {
            students.forEach(System.out::println);
        }
    }
}
