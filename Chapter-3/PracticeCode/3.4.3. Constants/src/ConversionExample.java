public class ConversionExample {

    public static double  convertFeetToMeters(double feet)
    {
        return feet * 0.3048;

    }

    public static void main (String[] args )
    {
        double feet = 10.0;
        double meter = convertFeetToMeters(feet);

        System.out.println(feet + " feel is "+ meter + "meters. ");
    }



}
