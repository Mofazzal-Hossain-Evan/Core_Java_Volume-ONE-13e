package VehicleSystem;

public class VehicleStore {

private Vehicle[]  Vehicles;

public VehicleStore( ) {

    this. Vehicles = new Vehicle[]{
            // Cars
            new Car("Toyota Corolla", 180, "Fuel", 50),
            new Car("Honda Civic", 200, "Fuel", 47),
            new Car("Ford Mustang", 250, "Fuel", 60),
            new ElectricCar("Tesla Model 3", 225, "Electric", 75),
            new ElectricCar("Nissan Leaf", 150, "Electric", 40),

            // Bikes
            new Bike("Yamaha R15", 155, "Fuel", 11),
            new Bike("Kawasaki Ninja", 220, "Fuel", 17),
            new Bike("Honda Shine", 100, "Fuel", 10),
            new Bike("Ather 450X", 116, "Electric", 3.7),
            new Bike("Ola S1", 120, "Electric", 4),

            // Trucks
            new Truck("Volvo FH16", 120, "Diesel", 25),
            new Truck("Scania R500", 130, "Diesel", 22),
            new Truck("Tata LPT 1618", 100, "Diesel", 16),
            new Truck("Mercedes Actros", 140, "Diesel", 30),
            new Truck("Tesla Cybertruck", 180, "Electric", 15)
        };

}
public Vehicle[] getVehicles() {
    return Vehicles;

}
}
