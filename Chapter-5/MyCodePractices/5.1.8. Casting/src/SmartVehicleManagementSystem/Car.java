package SmartVehicleManagementSystem;

public class Car extends Vehicle{
    public Car(String model) {
        super(model);
    }

    @Override
    void start(){
        System.out.println(model +" (Car) is starting with key." );
    }

    void airConditioning() {
        System.out.println(model + " AC is turned on.");
    }
}
