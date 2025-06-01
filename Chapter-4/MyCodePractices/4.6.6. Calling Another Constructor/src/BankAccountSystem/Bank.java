package BankAccountSystem;

public class Bank {

    public static void main(String[] args) {


        BankAccount acc1 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        BankAccount acc2 = new BankAccount(500.0);

        acc1.display();
        acc2.display();
        acc3.display();
    }
}