package SmartVehicleManagementSystem;

public class Bike extends Vehicle{
    public Bike(String model) {
        super(model);
    }

    @Override
    void start(){
        System.out.println(model + "(Bike) is starting " );
    }
}
