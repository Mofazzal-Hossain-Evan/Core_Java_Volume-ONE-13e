package VehicleRentalSystem;


public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new  Car("Luxury Sedan", 100, 50);
        Vehicle vehicle = new Vehicle("Standard Car", 60);

        System.out.println("Rental cost for car: " + car.calculateRentalCost(5));
        System.out.println("Rental cost for standard vehicle: " + vehicle.calculateRentalCost(5));
    }
}
