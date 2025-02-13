package CarRentalSystem;

public class Car {
    private String model;
    private int year;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String model, int year, double rentalPricePerDay ) {
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public String getModel(){
        return model;
    }

    public void rentCar(){
        if (isAvailable) {
            isAvailable = false;
            System.out.println(model + " has been rented.");
        } else {
            System.out.println(model + " is currently unavailable.");
        }
    }

    public void returnCar(){
        isAvailable = true;
        System.out.println(model + " has been returned.");
    }

    public void displayCarInfo(){
        System.out.println("Model: " + model + ", Year: " + year + ", Price per day: $" + rentalPricePerDay + ", Available: " + isAvailable);

    }



}
