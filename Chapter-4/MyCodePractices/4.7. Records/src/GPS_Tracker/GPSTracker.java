package GPS_Tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Record representing a location point with latitude, longitude, and altitude.
 */
record Location (double latitude, double longitude, double altitude){}


/**
 * Class to manage a GPS Tracker.
 */
class GPSTracker {
    private final List<Location> locationHistory;

    public GPSTracker() {
        this.locationHistory = new ArrayList<>();
    }

    /**
     * Adds a new location to the tracker.
     */

    public void addLocation(double latitude, double longitude, double altitude){
        Location newLocation = new Location(latitude, longitude, altitude);
        locationHistory.add(newLocation);
        System.out.println("new location added: "+ newLocation);
    }

    /**
     * Calculates the distance between two locations using the Haversine formula.
     */

    public static double calDistance(Location loc1, Location loc2){
        final double R = 6371.0; // Radius of Earth in kilometers

        double lat1 = Math.toRadians(loc1.latitude());
        double lon1 = Math.toRadians(loc1.longitude());
        double lat2 = Math.toRadians(loc1.latitude());
        double lon2 = Math.toRadians(loc2.longitude());

        double dLat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return R*c; // Distance in kilometers
    }

    /**
     * Displays the location history.
     */

    public void showHistory(){
        System.out.println("Location History");
        for (Location loc : locationHistory){
            System.out.println(loc);
        }
    }

    public List<Location> getLocationHistory(){
        return locationHistory;
    }


}
