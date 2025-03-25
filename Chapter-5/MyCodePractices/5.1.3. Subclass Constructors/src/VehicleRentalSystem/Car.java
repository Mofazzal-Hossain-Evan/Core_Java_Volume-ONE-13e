package VehicleRentalSystem;

public class Car extends Vehicle{
    private double luxuryTax;

    public Car(String model, double rentalRate,double luxuryTax) {
        super(model, rentalRate);
        this.luxuryTax = luxuryTax;
    }

    @Override
    public double calculateRentalCost(int days){
        return super.calculateRentalCost(days) + luxuryTax;
    }
}
