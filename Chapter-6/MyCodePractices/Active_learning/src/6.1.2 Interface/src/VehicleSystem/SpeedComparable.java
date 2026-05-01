package VehicleSystem;

// Interface with Constant + extends Movable (Hierarchy)
public interface SpeedComparable extends Movable {

    // Constant - automatically public static final
    double MAX_SAFE_SPEED = 200.0;

    int compareSpeed(Movable other);
}