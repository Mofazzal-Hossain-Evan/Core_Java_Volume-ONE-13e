package VirtualClassroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student extends User{

    boolean attendanceMarked;
    List<String> receivedNotes = new ArrayList<>();
    List<String> completedHomework = new ArrayList<>();

    Student(String name){
        super(name);
    }

    @Override
    void joinClass(){
        super.joinClass();
        System.out.println(name + " has enabled camera & microphone.");
        markAttendance();
    }

    void markAttendance(){
        attendanceMarked = true;
        System.out.println("AI-based attendance recorded for " + name);
    }

    void receiveNotes(String note){
        receivedNotes.add(note);
        System.out.println(name + " received note: " + note);
    }

    void receiveHomework(String homework){
        System.out.println(name + " received homework: " + homework);
    }

    void submitHomework(String homework) {
        completedHomework.add("Completed OOP exercises");
        System.out.println(name + " submitted homework: " + "Completed OOP exercises");
    }
    void takeQuiz(){
        Random rand = new Random();
        int score = rand.nextInt(100);
        System.out.println(name + " took a quiz and scored: " + score + "%");
    }

void interact(){
        System.out.println(name + " is asking a question.");
    }


}
