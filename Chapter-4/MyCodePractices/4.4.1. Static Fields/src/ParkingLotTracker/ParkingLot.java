package ParkingLotTracker;

public class ParkingLot {
    private static int totalSlots = 50;

    public static void parkCar(){
        if (totalSlots > 0){
            totalSlots--;
            System.out.println("Car parked. Slots left: " + totalSlots);
        } else {
            System.out.println("No parking slots available.");
        }
        }

    public static void removeCar(){
        totalSlots++;
        System.out.println("Car left. Slots available: " + totalSlots);
    }
}
