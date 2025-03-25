package VirtualClassroom;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        VirtualClassroom classroom = new VirtualClassroom(teacher);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Guest guest = new Guest("Charlie");

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addGuest(guest);

        classroom.startClass();
        classroom.shareNotes("Today's topic: Object-Oriented Programming");
        classroom.assignHomework("Complete OOP exercises.");
        classroom.studentsSubmitHomework("Completed OOP exercises");
        classroom.studentsTakeQuiz();
        classroom.interactionSession();
    }
}
