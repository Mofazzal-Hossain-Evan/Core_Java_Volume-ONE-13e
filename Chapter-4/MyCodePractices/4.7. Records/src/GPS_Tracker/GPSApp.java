package GPS_Tracker;


import java.util.List;

public class GPSApp {
    public static void main(String[] args) {
        GPSTracker Tracker = new GPSTracker();

        Tracker.addLocation(40.7128, -74.0060, 10.5);
        Tracker.addLocation(34.0522, -118.2437, 15.2);
        Tracker.addLocation(51.5074, -0.1278, 20.0);

        Tracker.showHistory();

        // Calculate distance between two locations
        List<Location> history = Tracker.getLocationHistory();
        if (history.size() > 1) {
            double distance = GPSTracker.calDistance(history.get(0), history.get(1));
            System.out.printf("Distance between first two locations: %.2f km%n", distance);
        }
    }
}
