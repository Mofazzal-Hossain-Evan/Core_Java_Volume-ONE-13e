package SimpleBankingSystem;

import java.util.Objects;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = Objects.requireNonNullElse(accountHolder,"Unknown");
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + "withdraw $"+ amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
public void displayBalance(){
    System.out.println(accountHolder + "'s Balance: $" + balance);
}



}
