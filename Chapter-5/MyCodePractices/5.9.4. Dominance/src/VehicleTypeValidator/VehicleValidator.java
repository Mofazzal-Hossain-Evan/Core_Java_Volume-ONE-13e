package VehicleTypeValidator;

public class VehicleValidator {
    public static void main(String[] args) {

        Vehicle v1 = new Truck(323423);
        Vehicle v2 = new Truck(34534);
        Vehicle v3 = new Truck(3000);     // Light truck
        Vehicle v4 = new Car("Toyota");   // Car
        Vehicle v5 = new Bus(50);         // Bus

        System.out.println(categorize(v1));
        System.out.println(categorize(v2));
        System.out.println(categorize(v3));
        System.out.println(categorize(v4));
        System.out.println(categorize(v5));



    }
    public static String categorize(Vehicle v){
        return switch (v){
            case Truck t when  t.getLoadCapacity() > 10000 -> "Heavy";
            case Truck t when  t.getLoadCapacity() > 5000 -> "Medium";
            case Truck t -> "Light truck";
            case Car c -> "Private car: " + c.getModel();
            case Bus b -> "Bus carrying " + b.getPassengerCount() + "Passenger";
            case null, default -> "Negative";
        };
    }
}
