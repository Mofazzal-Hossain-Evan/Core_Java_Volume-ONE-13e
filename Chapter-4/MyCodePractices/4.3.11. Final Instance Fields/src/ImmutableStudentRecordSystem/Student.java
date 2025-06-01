package ImmutableStudentRecordSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

final class Student {

private final String name;
private final int studentID;
private final List<String> examResults;

    public Student(String name, int studentID ) {
        this.name = name;
        this.studentID = studentID;
        this.examResults = new ArrayList<>(); // Final reference, but list is mutable
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public List<String> getExamResult() {
        return new ArrayList<>(examResults);  // Returning a copy to maintain immutability
    }

    public void addExamResult(String result){
        examResults.add(result);// Allowed because final affects reference, not content
    }

    @Override
    public String toString(){
        return "Student{name='" + name + "', ID=" + studentID + ", Results=" + examResults + "}";

    }
}
