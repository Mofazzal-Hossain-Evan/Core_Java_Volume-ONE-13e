import java.util.Objects;

public class Student {

    private String name;
    private String rollNumber;
    private String passportNumber;

    public Student(String name, String rollNumber, String passportNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Student other = (Student) otherObject;
        return Objects.equals(rollNumber, other.rollNumber)
                && Objects.equals(passportNumber, other.passportNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }


    public static void main(String[] args) {
// Creating two Student objects
        Student student1 = new Student("John Doe", "12345", "P12345678");
        Student student2 = new Student("Jane Smith", "12346", "P12345679");
        Student student3 = new Student("John Doe", "12345", "P12345678");

        // Printing the details of the Student objects
        System.out.println(student1);  // Prints the details of student1
        System.out.println(student2);  // Prints the details of student2
        System.out.println(student3);  // Prints the details of student3

        // Comparing two Student objects using equals()
        System.out.println("student1 equals student2: " + student1.equals(student2)); // False
        System.out.println("student1 equals student3: " + student1.equals(student3)); // True    }
    }
}