package PlanetaryGravityConstants;

public class SpaceMission {

    public static void main(String[] args) {
        double earthWeight = 70.0;

        double moonWeight = earthWeight * (Gravity.MOON / Gravity.EARTH);
        double marsWeight = earthWeight * (Gravity.MARS / Gravity.EARTH);
        System.out.println("Weight on Earth: " + earthWeight + " kg");
        System.out.println("Weight on Moon: " + moonWeight + " kg");
        System.out.println("Weight on Mars: " + marsWeight + " kg");

    }
}
