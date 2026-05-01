package VehicleSystem;

public class Bike extends Vehicle
        implements Movable, FuelPowered, ElectricPowered, SpeedComparable {

    private String powerType;

    public Bike(String name, int speed, String powerType, double capacity) {
        super(name, speed, capacity);
        this.powerType = powerType;
    }

    @Override
    public String getVehicleType() {
        return "Bike";
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

    // ==================== ElectricPowered ====================
    @Override
    public double getBatteryCapacity() {
        return powerType.equals("Electric") ? capacity : 0.0;
    }

    @Override
    public void charge(double kwh) {
        if (powerType.equals("Electric")) {
            System.out.println(name + " charged with " + kwh + " kWh");
        }
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