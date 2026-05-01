package VehicleSystem;

public final class ElectricCar extends Vehicle
        implements ElectricPowered, SpeedComparable, Comparable<ElectricCar> {

    private String powerType = "Electric";

    public ElectricCar(String name, int speed, String type,double batteryCapacity) {
        super(name, speed, batteryCapacity);
    }

    @Override
    public String getVehicleType() {
        return "ElectricCar";
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

    // ==================== ElectricPowered ====================
    @Override
    public double getBatteryCapacity() {
        return capacity;
    }

    @Override
    public void charge(double kwh) {
        System.out.println(name + " charged with " + kwh + " kWh");
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

    // ==================== Comparable ====================
    @Override
    public int compareTo(ElectricCar other) {
        return Double.compare(this.speed, other.speed);
    }

    // ==================== toString ====================
    @Override
    public String toString() {
        return name + "(" + speed + "km/h, Battery: " + capacity + "kWh)";
    }
}