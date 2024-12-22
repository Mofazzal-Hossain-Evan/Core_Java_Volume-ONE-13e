public class RectangleConversion {

    public static final double METERS_PER_FOOT = 0.3003;

    public static void main(String[] args)
    {
        double LengthInFeet = 15.23;
        double widthInfeet = 23.32;

        double LengthINmeter = LengthInFeet * METERS_PER_FOOT;
        double WidthINmeter = widthInfeet * METERS_PER_FOOT;

        double areaInMeters = LengthINmeter * WidthINmeter;
        double  perimeterInMeters = 2* (LengthINmeter + WidthINmeter);

        System.out.println("Rectangle dimensions in meters: " + LengthINmeter +
                " by " + WidthINmeter  );
        System.out.println("Area in meters: " + areaInMeters);
        System.out.println("Perimeter in meters: " + perimeterInMeters);

    }
}
