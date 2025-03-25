package AirlineReservationSystem;

public class EconomyPassenger extends Passenger{

    private int baggageLimit;
    private String mealType;

    public EconomyPassenger(String name, String passportNumber, int baggageLimit, String mealType) {
        super(name, passportNumber);
        this.baggageLimit = baggageLimit;
        this.mealType = mealType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Class: Economy, Baggage Limit: " + baggageLimit + "kg, Meal: " + mealType);
    }
}
