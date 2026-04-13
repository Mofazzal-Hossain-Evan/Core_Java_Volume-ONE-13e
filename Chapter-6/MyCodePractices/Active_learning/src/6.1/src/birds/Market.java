package birds;

import java.math.BigDecimal;
import java.util.Arrays;

public class Market {

    public static void main(String[] args) {
        // Asian Birds
        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        bird_details[] birds = asian.getBDINCN();
        Arrays.sort(birds);
        System.out.println("\n");
        System.out.println("\uD83D\uDC26 ASIAN BIRDS \uD83C\uDDE7\uD83C\uDDE9\uD83C\uDDEE\uD83C\uDDF3\uD83C\uDDE8\uD83C\uDDF3");
        for (bird_details asianB : birds) {
            System.out.println(asianB.getName() + " " + asianB.getColor() + " "
                    + asianB.getPrice() + " " + asianB.getWeight());
        }

        // Australian Birds
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        bird_details[] australianB = australian.getAU();
        Arrays.sort(australianB);
        System.out.println("\n");
        System.out.println("\uD83D\uDC26 AUSTRALIAN BIRDS \uD83C\uDDE6\uD83C\uDDFA");
        for (bird_details AUB : australianB) {
            System.out.println(AUB.getName() + " " + AUB.getColor() + " "
                    + AUB.getPrice() + " " + AUB.getWeight());
        }

        // European Birds
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();
        bird_details[] europeanB = european.getGBFRDE();
        Arrays.sort(europeanB);
        System.out.println("\n");
        System.out.println("\uD83D\uDC26 EUROPEAN BIRDS \uD83C\uDDEC\uD83C\uDDE7\uD83C\uDDEB\uD83C\uDDF7\uD83C\uDDE9\uD83C\uDDEA ");
        for (bird_details eu : europeanB) {
            System.out.println(eu.getName() + " " + eu.getColor() + " "
                    + eu.getPrice() + " " + eu.getWeight());
        }

        // Test Methods
        testBigDecimal();
        testStringBuilder();
        testNegativeZero();
        testNaN();
    }

    // ==================== TEST METHODS ====================

    static void testBigDecimal() {
        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();

        bird_details[] asians = asian.getBDINCN();
        bird_details[] aussies = australian.getAU();
        bird_details[] euros = european.getGBFRDE();

        System.out.println("\n=== BigDecimal Test using ALL birds (for loop) ===");

        System.out.println("\n--- Asian Birds ---");
        for (bird_details bird : asians) {
            int price = bird.getPrice();
            BigDecimal x = new BigDecimal(price + ".0");
            BigDecimal y = new BigDecimal(price + ".00");
            System.out.println(bird.getName() + " (Price: " + price + ") → equals: "
                    + x.equals(y) + ", compareTo: " + x.compareTo(y));

        }

        System.out.println("\n--- Australian Birds ---");
        for (bird_details bird : aussies) {
            int price = bird.getPrice();
            BigDecimal x = new BigDecimal(price + ".0");
            BigDecimal y = new BigDecimal(price + ".00");
            System.out.println(bird.getName() + " (Price: " + price + ") → equals: "
                    + x.equals(y) + ", compareTo: " + x.compareTo(y));
            System.out.println();
        }

        System.out.println("\n--- European Birds ---");
        for (bird_details bird : euros) {
            int price = bird.getPrice();
            BigDecimal x = new BigDecimal(price + ".0");
            BigDecimal y = new BigDecimal(price + ".00");
            System.out.println(bird.getName() + " (Price: " + price + ") → equals: "
                    + x.equals(y) + ", compareTo: " + x.compareTo(y));
        }
    }

    static void testStringBuilder() {
        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();

        bird_details[] asians = asian.getBDINCN();
        bird_details[] aussies = australian.getAU();
        bird_details[] euros = european.getGBFRDE();

        System.out.println("\n=== StringBuilder Test using ALL bird names ===");

        System.out.println("\n--- Asian Birds ---");
        for (bird_details b : asians) {
            StringBuilder x = new StringBuilder(b.getName());
            StringBuilder y = new StringBuilder(b.getName());
            System.out.println(b.getName() + " → StringBuilder equals: " + x.equals(y)
                    + ", Content equal: " + x.toString().equals(y.toString()));
        }

        System.out.println("\n--- Australian Birds ---");
        for (bird_details b : aussies) {
            StringBuilder x = new StringBuilder(b.getName());
            StringBuilder y = new StringBuilder(b.getName());
            System.out.println(b.getName() + " → StringBuilder equals: " + x.equals(y)
                    + ", Content equal: " + x.toString().equals(y.toString()));
        }

        System.out.println("\n--- European Birds ---");
        for (bird_details b : euros) {
            StringBuilder x = new StringBuilder(b.getName());
            StringBuilder y = new StringBuilder(b.getName());
            System.out.println(b.getName() + " → StringBuilder equals: " + x.equals(y)
                    + ", Content equal: " + x.toString().equals(y.toString()));
        }
    }

    static void testNegativeZero() {
        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();

        bird_details[] asians = asian.getBDINCN();
        bird_details[] aussies = australian.getAU();
        bird_details[] euros = european.getGBFRDE();

        System.out.println("\n=== Negative Zero Test using ALL bird weights ===");

        System.out.println("\nBird weights from all classes:");
        for (bird_details b : asians) System.out.println("Asian     → " + b.getName() + ": " + b.getWeight() + " kg");
        for (bird_details b : aussies) System.out.println("Australian → " + b.getName() + ": " + b.getWeight() + " kg");
        for (bird_details b : euros)   System.out.println("European   → " + b.getName() + ": " + b.getWeight() + " kg");

        double a = -0.0;
        double b = 0.0;
        System.out.println("\nTesting -0.0 == 0.0 :");
        System.out.println("-0.0 == 0.0     : " + (a == b));
        System.out.println("Double.equals   : " + Double.valueOf(a).equals(Double.valueOf(b)));
        System.out.println("Double.compare  : " + Double.compare(a, b));
    }

    static void testNaN() {
        ASIAN_BIRDS asian = new ASIAN_BIRDS();
        AUSTRALIAN_BIRDS australian = new AUSTRALIAN_BIRDS();
        EUROPEAN_BIRDS european = new EUROPEAN_BIRDS();

        bird_details[] asians = asian.getBDINCN();
        bird_details[] aussies = australian.getAU();
        bird_details[] euros = european.getGBFRDE();

        System.out.println("\n=== NaN Test using ALL bird weights ===");

        System.out.println("\nBird weights from all classes:");
        for (bird_details b : asians) System.out.println("Asian     → " + b.getName() + ": " + b.getWeight() + " kg");
        for (bird_details b : aussies) System.out.println("Australian → " + b.getName() + ": " + b.getWeight() + " kg");
        for (bird_details b : euros)   System.out.println("European   → " + b.getName() + ": " + b.getWeight() + " kg");

        double nan = Double.NaN;
        System.out.println("\nTesting NaN behavior:");
        System.out.println("nan == nan      : " + (nan == nan));
        System.out.println("Double.equals   : " + Double.valueOf(nan).equals(Double.valueOf(nan)));
        System.out.println("Double.compare  : " + Double.compare(nan, nan));
    }
}