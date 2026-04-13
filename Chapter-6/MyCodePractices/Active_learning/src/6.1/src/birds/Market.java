package birds;
import java.math.BigDecimal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Market {

    public static void main(String[] args) {

        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        bird_details[] birds = asian.getBDINCN();
        Arrays.sort(birds);

        System.out.println("\n");
        System.out.println("\uD83D\uDC26  ASIAN BIRDS \uD83C\uDDE7\uD83C\uDDE9\uD83C\uDDEE\uD83C\uDDF3\uD83C\uDDE8\uD83C\uDDF3");
       for (bird_details asianB :birds){
           System.out.println(
                   asianB.getName() + " " +
                           asianB.getColor() + " " +
                           asianB.getPrice() + " " +
                           asianB.getWeight()
           );
       }

       AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
       bird_details[] australianB = australian.getAU();
       Arrays.sort(australianB);
        System.out.println("\n");
        System.out.println("\uD83D\uDC26  AUSTRALIAN BIRDS \uD83C\uDDE6\uD83C\uDDFA");

       for (bird_details AUB : australianB){
           System.out.println(

                   AUB.getName() + " " +
                           AUB.getColor() + " " +
                           AUB.getPrice() + " " +
                           AUB.getWeight()
           );
       }

       EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();
       bird_details[] europeanB = european.getGBFRDE();
       Arrays.sort(europeanB);

       System.out.println("\n");
       System.out.println("\uD83D\uDC26  EUROPEAN BIRDS \uD83C\uDDEC\uD83C\uDDE7\uD83C\uDDEB\uD83C\uDDF7\uD83C\uDDE9\uD83C\uDDEA ");
       for (bird_details eu : europeanB){
           System.out.println(
                   eu.getName() + " " +
                           eu.getColor() + " " +
                           eu.getPrice() + " " +
                           eu.getWeight()
           );
       }


        testBigDecimal();
        testStringBuilder();
        testNegativeZero();
        testNaN();

    }

    static void testBigDecimal(){

        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();

        bird_details[] asians = asian.getBDINCN();
        bird_details[] aussies = australian.getAU();
        bird_details[] euros = european.getGBFRDE();

        System.out.println("\n=== BigDecimal Test using ALL bird classes ===");
        System.out.println();
        
        //Asian
        if (asians != null){
            for (bird_details bird : asians){

                int price  = bird.getPrice();
                BigDecimal x = new BigDecimal(price+".0" );
                BigDecimal y = new BigDecimal(price + ".00");

                System.out.println("Asian bird (" + bird.getName() + ") price " + price + ":");
                System.out.println();
                System.out.println("BigDecimal equals: " + x.equals(y));
                System.out.println("BigDecimal compareTo: " + x.compareTo(y));
            }
        }

        //AUSTRALIAN
        if (aussies != null){
            for (bird_details bird : aussies){
                int price  = bird.getPrice();
                BigDecimal x = new BigDecimal(price+".0" );
                BigDecimal y = new BigDecimal(price + ".00");

                System.out.println("Australian birds (" + bird.getName() + ") price " + price + ":");
                System.out.println();
                System.out.println("BigDecimal equals: " + x.equals(y));
                System.out.println("BigDecimal compareTo: " + x.compareTo(y));
            }
        }
        //European
        if (euros != null){
            for (bird_details bird : euros){
                int price  = bird.getPrice();
                BigDecimal x = new BigDecimal(price+".0" );
                BigDecimal y = new BigDecimal(price + ".00");

                System.out.println("European birds (" + bird.getName() + ") price " + price + ":");
                System.out.println();
                System.out.println("BigDecimal equals: " + x.equals(y));
                System.out.println("BigDecimal compareTo: " + x.compareTo(y));

            }
        }
    }

    static void testStringBuilder(){

        StringBuilder x = new StringBuilder("Hello");
        StringBuilder y = new StringBuilder("World");

        System.out.println("\n");
        System.out.println("StringBuilder equals: " + x.equals(y));
        System.out.println("Content equal: " + x.toString().equals(y.toString()));
    }

    static void testNegativeZero(){
        double a = -0.0;
        double b = 0.0;

        System.out.println("\n");
        System.out.println("-0.0 == 0.0 : " +(a==b));
        System.out.println("Double.equals: " +
                Double.valueOf(a).equals(Double.valueOf(b)));
        System.out.println("Double.compare: " + Double.compare(a, b));
    }

    static void testNaN() {

        double nan = Double.NaN;

        System.out.println("\n");
        System.out.println("nan == nan : " + (nan == nan)); // false

        System.out.println("Double.equals: " +
                Double.valueOf(nan).equals(Double.valueOf(nan))); // true

        System.out.println("Double.compare: " +
                Double.compare(nan, nan)); // 0
    }



}
