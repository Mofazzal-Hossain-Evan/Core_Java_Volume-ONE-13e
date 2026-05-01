package VehicleSystem;

public class VehicleSystem {

    public static void main(String[] args) {

        VehicleStore store = new VehicleStore();
        Vehicle[] fleet = store.getVehicles();

        System.out.println("Fleet Size: " + fleet.length);
        System.out.println();
        System.out.println("✅ Interface variable declare করা যায়:");
        Movable m1 = new Car("Toyota", 180, "Fuel", 50);
        Movable m2 = new Bike("Yamaha", 155, "Fuel", 11);
        System.out.println();
        System.out.println("\n=== 2. instanceof দিয়ে Interface চেক ===\n");
        for (Vehicle v : fleet) {
            System.out.println();
            if (v instanceof SpeedComparable) {
                System.out.println(v.getName() + " is SpeedComparable ✔");
            }
        if (v instanceof FuelPowered) {
            System.out.println(v.getName() + " is FuelPowered ✔");
          }
        }

        System.out.println();

        System.out.println("\n=== 3. Interface Polymorphism ===\n");
        Movable fastVehicle = new Car("Ford Mustang", 250, "Fuel", 60);
        fastVehicle.move();
        System.out.println();


        System.out.println("\n=== 4. Interface Hierarchy & Constant ===\n");
        Car mustang = new Car("Ford Mustang", 250, "Fuel", 60);
        if (mustang.getSpeed() > SpeedComparable.MAX_SAFE_SPEED){
            System.out.println("Warning: Over Safe Speed Limit!");
        } else {
            System.out.println("Speed is within safe limit.");
        }
        System.out.println();

        System.out.println("\n=== 5. Multiple Interface Implementation ===\n");
        System.out.println("Car implements: Movable, FuelPowered/ElectricPowered, SpeedComparable, VehicleBehavior");

        System.out.println();
        System.out.println("\n=== 6. Sealed Interface Test ===\n");
        VehicleBehavior vb = new Car("Tesla Model 3", 225, "Electric", 75);
        System.out.println("Car implements sealed VehicleBehavior: " + (vb instanceof VehicleBehavior));
        System.out.println();

        System.out.println("\n=== 7. Comparable + Generic Method ===\n");
        Car CarA = new Car("Honda Civic", 200, "Fuel", 47);
        Car CarB = new Car("Ford Mustang", 250, "Fuel", 60);

        System.out.println();
        Comparable<Car> c1 = CarA;
        System.out.println("Honda vs Mustang: " + c1.compareTo(CarB));

    processData(CarA, CarB);
    processData(CarB, CarA);
        System.out.println();
        System.out.println("\n=== 8. Mixed Object Array + Pattern Matching instanceof ===\n");
        Object[] mixed = {new Car("Tesla", 225, "Electric", 75),
                new Bike("R15", 155, "Fuel", 11),
                "Random String", 100, true};

        for(Object item: mixed){
            if (item instanceof Movable m){
                m.move();
            } else if (item instanceof Comparable<?> c){
                System.out.println("Comparable found: " + item.getClass().getSimpleName());
            } else {
                System.out.println("Unknown item → " + item);
            }
            System.out.println("\n=== All logics from Section 6.1.2 practiced successfully! ===");
        }


    }
    /// Generic Method (from your bird logic)
    public static <T extends Comparable<T>> void processData(T a, T b){

        int result = a.compareTo(b);
        if (result > 0){
            System.out.println(a + " is greater than " + b);

        }else if (result < 0){
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal than " + b);
        }
    }
}
