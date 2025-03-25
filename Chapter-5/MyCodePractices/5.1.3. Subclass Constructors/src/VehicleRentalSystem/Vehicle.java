package VehicleRentalSystem;

public class Vehicle {
    protected String model;
    protected double rentalRate;

    public Vehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days){
        return days * rentalRate;
    }
}
