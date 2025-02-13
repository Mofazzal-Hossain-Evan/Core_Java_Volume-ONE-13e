package CarRentalSystem;

public class CarRentalTest {
    public static void main(String[] args) {
        RentalService rental = new RentalService();

        rental.addCar(new Car("Toyota Camry", 2020, 40));
        rental.addCar(new Car("Honda Civic", 2019, 35));

        rental.displayAvailableCars();
        rental.rentCarByModel("Toyota Camry");
        rental.displayAvailableCars();
    }
}
