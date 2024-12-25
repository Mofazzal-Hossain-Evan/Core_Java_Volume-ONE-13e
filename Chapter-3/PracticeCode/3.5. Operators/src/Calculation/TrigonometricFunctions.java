package Calculation;

public class TrigonometricFunctions {

    public static void main(String[] args) {
        double angleDegrees = 45.0;
        double angleRadians =Math.toRadians(angleDegrees);

        double sinValue = Math.sin(angleDegrees);
        double cosValue = Math.cos(angleDegrees);
        double tanValue = Math.tan(angleDegrees);

        double atanValue = Math.atan(tanValue);
        double atan2Value = Math.atan2(2, 3);

        System.out.println("Angle: " + angleDegrees + " degrees");
        System.out.println("Sin: " + sinValue);
        System.out.println("Cos: " + cosValue);
        System.out.println("Tan: " + tanValue);
        System.out.println("Arctan (atan): " + Math.toDegrees(atanValue) + " degrees"); // Convert radians to degrees
        System.out.println("Arctan2 (atan2): " + Math.toDegrees(atan2Value) + " degrees"); // Convert radians to degrees
    }
    
}
