package VirtualClassroom;

import java.util.ArrayList;
import java.util.List;

public class VirtualClassroom {

    Teacher teacher;
    List<Student> students = new ArrayList<>();
    List<Guest> guests = new ArrayList<>();

     VirtualClassroom(Teacher teacher) {
        this.teacher = teacher;
    }

    void addStudent(Student student) {
        students.add(student);
        teacher.addStudent(student);
    }

    void addGuest(Guest guest) {
        guests.add(guest);
    }

    void startClass() {
        System.out.println("\n--- Virtual Classroom Session ---");
        teacher.joinClass();
        for (Student student : students) {
            student.joinClass();
        }
        for (Guest guest : guests) {
            guest.joinClass();
        }
    }

    void shareNotes(String note) {
        System.out.println("\n--- Real-time Notes Sharing ---");
        teacher.shareNotes(note);
    }

    void studentsSubmitHomework(String homework) { // ✅ ফ্লেক্সিবল ইনপুট
        System.out.println("\n--- Students Submitting Homework ---");
        for (Student student : students) {
            student.submitHomework(homework);
        }
    }




    void interactionSession() {
        System.out.println("\n--- Interaction ---");
        teacher.interact();
        for (Student student : students) {
            student.interact();
        }
        for (Guest guest : guests) {
            guest.interact(); // ✅ সঠিক সংশোধন
        }
    }


    void assignHomework(String homework) {
        System.out.println("\n--- Assigning Homework ---");
        teacher.assignHomework(homework);
    }

    void studentsTakeQuiz() {
        System.out.println("\n--- Students Taking Quiz ---");
        for (Student student : students) {
            student.takeQuiz();
        }
    }
}
