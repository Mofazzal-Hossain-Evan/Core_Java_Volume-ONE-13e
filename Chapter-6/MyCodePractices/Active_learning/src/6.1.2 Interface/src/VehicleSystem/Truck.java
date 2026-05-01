package VehicleSystem;

public class Truck extends Vehicle
        implements Movable, FuelPowered, SpeedComparable {

    private String powerType;   // Mostly "Diesel", sometimes "Electric"

    public Truck(String name, int speed, String powerType, double capacity) {
        super(name, speed, capacity);
        this.powerType = powerType;
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    // ==================== Movable ====================
    @Override
    public void move() {
        System.out.println(getVehicleType() + " [" + name + "] is moving at " + speed + " km/h");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    // ==================== FuelPowered ====================
    @Override
    public double getFuelCapacity() {
        return capacity;   // Trucks usually use fuel/diesel
    }

    @Override
    public void refuel(double amount) {
        System.out.println(name + " refueled with " + amount + " liters");
    }

    // ==================== SpeedComparable ====================
    @Override
    public int compareSpeed(Movable other) {
        return Double.compare(this.getSpeed(), other.getSpeed());
    }

    // ==================== VehicleBehavior ====================
    @Override
    public String getPowerType() {
        return powerType;
    }
}