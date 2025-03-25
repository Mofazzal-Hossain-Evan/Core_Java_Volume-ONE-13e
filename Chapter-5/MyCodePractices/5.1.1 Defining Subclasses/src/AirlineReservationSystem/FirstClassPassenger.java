package AirlineReservationSystem;

import SchoolManagementSystem.Person;

public class FirstClassPassenger extends Passenger {

    private boolean VIPService;
    private boolean priorityCheckIn;

    public FirstClassPassenger(String name, String passportNumber, boolean VIPService, boolean priorityCheckIn) {
        super(name, passportNumber);
        this.VIPService = VIPService;
        this.priorityCheckIn = priorityCheckIn;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Class: First Class, VIP Service: " + (VIPService ? "Yes" : "No"));

        /***
         condition ? value_if_true : value_if_false;
         If condition is true, the first value (value_if_true) is returned.
         If condition is false, the second value (value_if_false) is returned.
        ***/
    }
}
