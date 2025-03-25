package AirlineReservationSystem;


import SchoolManagementSystem.Person;

public class BusinessPassenger extends Passenger {

    private boolean loungeAccess;
    private int extraBaggage;

    public BusinessPassenger(String name, String passportNumber, boolean loungeAccess, int extraBaggage) {
        super(name, passportNumber);
        this.loungeAccess = loungeAccess;
        this.extraBaggage = extraBaggage;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Class: Business, Lounge Access: " + (loungeAccess ? "Yes" : "No") + ", Extra Baggage: " + extraBaggage + "kg");
    }
}
