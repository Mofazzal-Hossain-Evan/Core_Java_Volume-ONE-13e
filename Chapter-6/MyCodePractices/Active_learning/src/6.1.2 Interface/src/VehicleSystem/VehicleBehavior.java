package VehicleSystem;

// Sealed Interface (Java 17+)
public sealed interface VehicleBehavior
        permits Movable {

    String getPowerType();
}