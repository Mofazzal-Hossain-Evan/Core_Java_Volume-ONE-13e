package VehicleTypeValidator;

sealed class Vehicle permits Car, Truck, Bus { }

//sub-class


final class Car extends Vehicle{
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

final class Truck extends Vehicle{
    private final int loadCapacity;

    public Truck(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}

// Subclass: Bus
final class Bus extends Vehicle {
    private final int passengerCount;

    public Bus(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}

