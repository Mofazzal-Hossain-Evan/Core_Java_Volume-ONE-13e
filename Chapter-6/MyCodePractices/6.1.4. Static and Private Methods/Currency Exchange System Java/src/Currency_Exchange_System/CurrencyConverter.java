/* Package declaration */
package Currency_Exchange_System;

/**
 * CurrencyConverter Interface
 * ---------------------------
 * থিওরি (বাংলা):
 * ========================
 * - Java interface-এ static method ব্যবহার করলে, আমরা utility function রাখতে পারি
 *   যা কোনো instance ছাড়াই সরাসরি ডাকা যায় (CurrencyConverter.toUSD(...)).
 * - এখানে private static method ব্যবহার করেছি `getExchangeRate` নাম দিয়ে,
 *   যা interface-এর ভেতরে internal logic হিসেবে কাজ করে — বাইরে থেকে অ্যাক্সেস করা যায় না।
 * - এর ফলে, rate calculation-এর লজিক encapsulated থাকে।
 * - Implementation classes (BankConverter, OnlineConverter) শুধুমাত্র interface-এর
 *   static method ব্যবহার করবে; তারা নিজেরা conversion logic implement করবে না।
 */
public interface CurrencyConverter {

    /* Static method: Convert to USD from given currency */
    static double toUSD(double amount, String currency) {
        double rate = getExchangeRate(currency, "USD"); // helper method call
        return amount * rate;
    }

    /* Static method: Convert to EUR from given currency */
    static double toEUR(double amount, String currency) {
        double rate = getExchangeRate(currency, "EUR");
        return amount * rate;
    }

    /*
     * Private helper method to get exchange rate between two currencies.
     * এখানে আমরা একটি fixed rate table ব্যবহার করছি (simulation এর জন্য)।
     */
    private static double getExchangeRate(String fromCurrency, String toCurrency) {
        // Normalize currency codes
        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();

        // Simple fixed rates (simulation)
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return 0.92;
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) return 1.09;
        if (fromCurrency.equals("USD") && toCurrency.equals("USD")) return 1.0;
        if (fromCurrency.equals("EUR") && toCurrency.equals("EUR")) return 1.0;
        if (fromCurrency.equals("BDT") && toCurrency.equals("USD")) return 0.0091;
        if (fromCurrency.equals("BDT") && toCurrency.equals("EUR")) return 0.0084;
        if (fromCurrency.equals("USD") && toCurrency.equals("BDT")) return 110.0;
        if (fromCurrency.equals("EUR") && toCurrency.equals("BDT")) return 118.0;

        throw new IllegalArgumentException("Unsupported currency conversion: " + fromCurrency + " -> " + toCurrency);
    }

    /* Abstract method for implementations to describe themselves */
    String getConverterName();
}
