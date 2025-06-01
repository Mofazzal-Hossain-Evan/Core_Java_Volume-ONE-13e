package CurrencyExchangeRates;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter: ");

        double usdAmount = scanner.nextDouble();

        double eurAmount = usdAmount * ExchangeRates.USD_TO_EUR;
        double gbpAmount = usdAmount * ExchangeRates.USD_TO_GBP;
        double inrAmount = usdAmount * ExchangeRates.USD_TO_INR;

        System.out.println("Equivalent in EUR: " + eurAmount);
        System.out.println("Equivalent in GBP: " + gbpAmount);
        System.out.println("Equivalent in INR: " + inrAmount);

        scanner.close();
    }
}
