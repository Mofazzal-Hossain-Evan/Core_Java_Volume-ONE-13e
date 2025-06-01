package AutomatedBankAccountSystem;

public class BankAccount {
    private static double interestRate;
    private static  int acoountCountter = 100;

    private int accountNumber;
    private double balance;

    static {
        interestRate = 3.5;
    }

    {
        accountNumber = acoountCountter++;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("BankAccount [Number=" + accountNumber + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%]");

    }

    public static void main(String[] args) {
        System.out.println("\n🔹 Bank Account Test");
        BankAccount acc1 = new BankAccount(2000);
        acc1.display();
    }
}
