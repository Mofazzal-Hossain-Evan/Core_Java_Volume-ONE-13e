package VirtualClassroom;



import java.util.ArrayList;
import java.util.List;

class Teacher extends User {
    List<String> notes = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public Teacher(String name) {
        super(name);
    }

    @Override
    void joinClass() {
        super.joinClass();
        System.out.println(name + " has started the lecture.");
        startLiveStream();
    }

    void startLiveStream() {
        System.out.println("Live video streaming started by " + name);
    }

    void shareNotes(String note) {
        notes.add(note);
        System.out.println(name + " shared note: " + note);
        for (Student student : students) {
            student.receiveNotes(note);
        }
    }

    void assignHomework(String homework) {
        System.out.println(name + " assigned homework: " + homework);
        for (Student student : students) {
            student.receiveHomework(homework);
        }
    }

public void addStudent(Student student) {

        students.add(student);
    }


    void interact() {
        System.out.println(name + " is answering students' questions.");
    }
}
