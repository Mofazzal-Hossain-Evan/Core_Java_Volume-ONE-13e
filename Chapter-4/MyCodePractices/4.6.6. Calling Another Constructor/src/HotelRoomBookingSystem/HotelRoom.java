package HotelRoomBookingSystem;

public class HotelRoom {

    private String roomType;
    private int nights;

    // Constructor 1: If only room type is provided, set default nights = 1
public  HotelRoom(String roomType) {
    this(roomType, 1); // // Calls second constructor
}

    public HotelRoom(String roomType, int nights) {
        this.roomType = roomType;
        this.nights = nights;
    }
    public void displayBooking(){
        System.out.println("Room Type: " + roomType + " | Nights: " + nights);

    }
}
