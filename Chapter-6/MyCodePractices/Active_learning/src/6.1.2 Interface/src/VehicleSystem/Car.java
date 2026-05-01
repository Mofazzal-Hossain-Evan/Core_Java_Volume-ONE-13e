package VehicleSystem;

public class Car extends Vehicle
        implements Movable,
        FuelPowered,
        SpeedComparable,
        Comparable<Car> {     // ← এটা যোগ করো

    private String powerType;

    public Car(String name, int speed, String powerType, double capacity) {
        super(name, speed, capacity);
        this.powerType = powerType;
    }

    @Override
    public String getVehicleType() {
        return "Car";
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
        return powerType.equals("Fuel") ? capacity : 0.0;
    }

    @Override
    public void refuel(double amount) {
        if (powerType.equals("Fuel")) {
            System.out.println(name + " refueled with " + amount + " liters");
        }
    }



    // ==================== SpeedComparable ====================
    @Override
    public int compareSpeed(Movable other) {
        return Double.compare(this.getSpeed(), other.getSpeed());
    }

    // ==================== VehicleBehavior (Sealed) ====================
    @Override
    public String getPowerType() {
        return powerType;
    }

    // ==================== Comparable<Car> ====================
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }
}