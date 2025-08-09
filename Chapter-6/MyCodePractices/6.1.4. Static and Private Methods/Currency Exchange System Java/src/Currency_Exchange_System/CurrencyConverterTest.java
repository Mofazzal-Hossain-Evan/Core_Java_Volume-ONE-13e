/* Package declaration */
package Currency_Exchange_System;

/**
 * CurrencyConverterTest Class
 * ---------------------------
 * থিওরি (বাংলা):
 * ========================
 * - এখানে আমরা BankConverter এবং OnlineConverter এর object বানিয়েছি।
 * - Conversion-এর জন্য instance নয়, interface-এর static method ব্যবহার করছি।
 * - Private helper method getExchangeRate সরাসরি ডাকা যায় না, কিন্তু
 *   static method-এর মাধ্যমে indirectভাবে কাজ করে।
 */
public class CurrencyConverterTest {

    public static void main(String[] args) {
        // Create converter instances
        CurrencyConverter bank = new BankConverter();
        CurrencyConverter online = new OnlineConverter();

        // Test Bank Converter
        System.out.println(bank.getConverterName());
        double usdFromBdt = CurrencyConverter.toUSD(5000, "BDT");
        double eurFromUsd = CurrencyConverter.toEUR(100, "USD");
        System.out.println("5000 BDT -> USD: " + usdFromBdt);
        System.out.println("100 USD -> EUR: " + eurFromUsd);

        System.out.println();

        // Test Online Converter
        System.out.println(online.getConverterName());
        double usdFromEur = CurrencyConverter.toUSD(50, "EUR");
        double eurFromBdt = CurrencyConverter.toEUR(10000, "BDT");
        System.out.println("50 EUR -> USD: " + usdFromEur);
        System.out.println("10000 BDT -> EUR: " + eurFromBdt);
    }
}
