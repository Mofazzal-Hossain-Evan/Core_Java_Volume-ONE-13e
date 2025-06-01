package HotelRoomBookingSystem;

public class HotelBooking {
    public static void main(String[] args) {
        HotelRoom b1 = new HotelRoom("Heigh");
        HotelRoom b2 = new HotelRoom("Suite", 4);

        b1.displayBooking();
        b2.displayBooking();
    }
}
