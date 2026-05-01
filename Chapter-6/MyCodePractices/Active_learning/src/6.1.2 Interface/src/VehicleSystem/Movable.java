package VehicleSystem;

// Base Interface + extends Sealed Interface
public non-sealed interface Movable extends VehicleBehavior {

    void move();
    double getSpeed();
}