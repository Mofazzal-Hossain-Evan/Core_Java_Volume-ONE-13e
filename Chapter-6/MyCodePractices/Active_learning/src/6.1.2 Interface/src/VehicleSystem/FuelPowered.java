package VehicleSystem;

public interface FuelPowered extends Movable {

    double getFuelCapacity();
    void refuel(double amount);
}