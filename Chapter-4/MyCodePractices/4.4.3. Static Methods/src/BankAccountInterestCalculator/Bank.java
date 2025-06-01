package BankAccountInterestCalculator;

public class Bank {
    private static double interestRate = 5.0;

    public static void setInterestRate(double rate){
        interestRate = rate;
    }

    public static double calInterest(double balance){
        return (balance * interestRate) / 100;
    }

    public static void main(String[] args) {
        System.out.println("Interest on $1000: $" + Bank.calInterest(1000));
        Bank.setInterestRate(6.4);
        System.out.println("Interest on $1000 after rate change: $" +Bank.calInterest(1000));
    }
}
