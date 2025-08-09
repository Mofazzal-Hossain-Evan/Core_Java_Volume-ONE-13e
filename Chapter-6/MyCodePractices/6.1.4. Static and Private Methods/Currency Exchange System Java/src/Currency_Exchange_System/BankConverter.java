/* Package declaration */
package Currency_Exchange_System;

/**
 * BankConverter Class
 * -------------------
 * থিওরি (বাংলা):
 * ========================
 * - BankConverter বাস্তব জীবনের ব্যাংকের মতো আচরণ করবে।
 * - যদিও conversion logic interface-এ আছে, এখানে আমরা শুধু converter-এর নাম দিয়েছি।
 * - Conversion কাজের জন্য সরাসরি interface-এর static method ব্যবহার করা হবে।
 */
public class BankConverter implements CurrencyConverter {

    @Override
    public String getConverterName() {
        return "Bank Converter - Official Bank Rates";
    }
}
