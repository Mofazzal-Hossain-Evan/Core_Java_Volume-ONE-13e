package BankAccountSystem;

public class BankAccount {

    private static int nextAccountNumber = 100;
    private int accountNumber;
    private double balance;

    // Constructor 1: No deposit provided, sets a default deposit
    public BankAccount(){
        this(100.0);
    }

    // Constructor 2: Deposit provided
public  BankAccount(double initialDeposit){
        this.accountNumber = nextAccountNumber++;

        /***
         * Breaking It Down
         * nextAccountNumber is a static variable
         * It holds the next available account number.
         * Since it's static, its value is shared across all instances of the class.
         * Post-increment (nextAccountNumber++) behavior
         * this.accountNumber = nextAccountNumber; → Assigns the current value of nextAccountNumber to accountNumber.
         * nextAccountNumber++ → Increments nextAccountNumber after the assignment
    ***/
        this.balance = initialDeposit;
}

public void display(){
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);

    }
}
