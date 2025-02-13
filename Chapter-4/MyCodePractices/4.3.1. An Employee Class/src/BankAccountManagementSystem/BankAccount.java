package BankAccountManagementSystem;

public class BankAccount {
    private String accountHolderName;
    private  String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited. New Balance: $" + balance);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: $" + balance);
        } else {
            System.out.println("no balance");
        }
    }

    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolderName + ", Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
