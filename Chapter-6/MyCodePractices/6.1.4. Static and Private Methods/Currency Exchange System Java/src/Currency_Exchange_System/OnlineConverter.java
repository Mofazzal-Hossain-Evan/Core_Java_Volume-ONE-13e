/* Package declaration */
package Currency_Exchange_System;

/**
 * OnlineConverter Class
 * ---------------------
 * থিওরি (বাংলা):
 * ========================
 * - OnlineConverter অনলাইন API-এর মতো কাজ করবে (এখানে fixed rate simulation)।
 * - এটি interface-এর static method call করে conversion করবে।
 * - এই design-এর সুবিধা: rate calculation logic central থাকে interface-এ,
 *   আর বিভিন্ন converter কেবল তাদের পরিচয় দেয়।
 */
public class OnlineConverter implements CurrencyConverter {

    @Override
    public String getConverterName() {
        return "Online Converter - Live Market Rates (Simulated)";
    }
}
