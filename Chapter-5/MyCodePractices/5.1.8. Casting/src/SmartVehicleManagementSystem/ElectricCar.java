package SmartVehicleManagementSystem;

public class ElectricCar extends  Car{
    public ElectricCar(String model) {
        super(model);
    }

    @Override
    void start(){
        System.out.println(model + " (Electric Car) is starting with push button.");
    }
    void chargeBattery(){
        System.out.println(model + " battery is charging...");
    }
}
