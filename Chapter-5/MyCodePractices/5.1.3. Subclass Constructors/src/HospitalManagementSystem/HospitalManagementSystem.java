package HospitalManagementSystem;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Harris", 45, 70000, 10000);
        Person person = new Person("Nurse Mary", 30);

        System.out.println(doctor.getName() + "'s salary: " + doctor.getSalary());
        System.out.println(person.getName() + " (No salary assigned to person)");
    }
}

