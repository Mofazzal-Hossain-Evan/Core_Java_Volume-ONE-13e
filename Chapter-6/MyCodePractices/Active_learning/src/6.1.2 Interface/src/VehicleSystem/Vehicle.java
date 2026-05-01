package VehicleSystem;

public abstract class Vehicle {

    protected String name;
    protected int speed;
    protected double capacity;

    public Vehicle(String name, int speed, double capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    // Common behavior (all vehicles can expose info)
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCapacity() {
        return capacity;
    }

    // Optional: force subclasses to define their own identity
    public abstract String getVehicleType();

    // Optional: common display method (polymorphic override possible later)
    public void printInfo() {
        System.out.println(
                getVehicleType() +
                        " | Name: " + name +
                        " | Speed: " + speed +
                        " | Capacity: " + capacity
        );
    }
}