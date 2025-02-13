package CarRentalSystem;

import java.util.ArrayList;

 class RentalService {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    public void rentCarByModel(String model) {
        for (Car c : cars ){
            if (c.getModel().equalsIgnoreCase(model) && c.isAvailable() ){
                c.rentCar();
                return;
            }
        }
        System.out.println("Car not found or unavailable.");
    }

    public void displayAvailableCars(){
        boolean found = false;
        for (Car c : cars){
            if (c.isAvailable()) {
                c.displayCarInfo();
                found = true;
            }
            }
        if (!found){
            System.out.println("No available cars.");

        }
        }

}
