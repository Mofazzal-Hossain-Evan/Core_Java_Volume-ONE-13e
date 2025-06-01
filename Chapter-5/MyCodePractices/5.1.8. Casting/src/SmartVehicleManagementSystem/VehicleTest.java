package SmartVehicleManagementSystem;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyo");
        Vehicle v2 = new ElectricCar("Tesla");
        Vehicle b1 = new Bike("Hero");

        v1.start();
        v2.start();
        b1.start();

        // Downcasting Example
        if (v2 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v2;
            ec.chargeBattery();
        }

        if (b1 instanceof ElectricCar){
            ElectricCar bike = (ElectricCar) b1;
            bike.chargeBattery();
        }
    }
}
