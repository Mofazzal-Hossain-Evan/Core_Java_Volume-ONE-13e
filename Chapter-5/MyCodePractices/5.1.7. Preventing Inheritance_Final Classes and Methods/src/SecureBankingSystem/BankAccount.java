package SecureBankingSystem;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolder, double balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        // Problem: Description method is called in the constructor, which can lead to issues if overridden
        System.out.println("Account Created: " + description());
    }

    public final String description(){
        return "Account Holder: " + accountHolder + ", Balance: $" + balance + ", Account Number: " + accountNumber;
    }
}
