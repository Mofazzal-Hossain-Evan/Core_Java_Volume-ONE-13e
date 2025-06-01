package CurrencyConverterFactory;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatterFactory {

    private static NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    private static  NumberFormat ukFormatter =NumberFormat.getCurrencyInstance(Locale.UK);
    private static NumberFormat bdFormatter = NumberFormat.getCurrencyInstance(new Locale("en","Bdt"));

    public static NumberFormat getFormatter(String country){
        switch (country.toLowerCase()) {
            case "us":
                return usFormatter;

            case "uk":
                return ukFormatter;

            case "bangladesh":
                return bdFormatter;

            default:
                throw new IllegalArgumentException("unknown");
        }
    }

    public static void main(String[] args) {
        double amount = 1234.43;

        System.out.println("US: "+ CurrencyFormatterFactory.getFormatter("US").format(amount));
        System.out.println("UK: " + CurrencyFormatterFactory.getFormatter("UK").format(amount));
        System.out.println("Bangladesh: "+ CurrencyFormatterFactory.getFormatter("Bangladesh").format(amount));
    }
}
