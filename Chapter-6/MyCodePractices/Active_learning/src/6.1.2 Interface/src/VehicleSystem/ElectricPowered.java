package VehicleSystem;

public interface ElectricPowered extends Movable {

    double getBatteryCapacity();
    void charge(double kwh);
}