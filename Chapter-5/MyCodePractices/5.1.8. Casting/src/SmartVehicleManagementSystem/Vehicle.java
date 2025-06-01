package SmartVehicleManagementSystem;

public class Vehicle {

    String model;

    public Vehicle(String model) {
        this.model = model;
    }

    void start(){
        System.out.println(model + "is Starting");
    }

}
