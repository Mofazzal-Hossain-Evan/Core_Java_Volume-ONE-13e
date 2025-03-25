package AirlineReservationSystem;

public class Passenger {

    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Passport: " + passportNumber);
    }
}
