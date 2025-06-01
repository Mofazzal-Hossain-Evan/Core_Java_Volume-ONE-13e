package TimeCapsuleCreator;

import java.time.LocalDate;
import java.time.Year;

public class TimeCapsule {
    String owner;
    String message;
    LocalDate openDate;

    public TimeCapsule(String owner, String message,int year, int month, int day) {
        this.owner = owner;
        this.message = message;
        this.openDate = LocalDate.of(year, month, day);
    }

    void displayDetails(){
        System.out.println("\"Time Capsule Details:\"");
        System.out.println("Owner: " + (owner.isEmpty() ? "unknown ": owner));
        System.out.println("message: " + message);
        System.out.println("Open Date: " + openDate);
        System.out.println("--------------------");
    }
}
