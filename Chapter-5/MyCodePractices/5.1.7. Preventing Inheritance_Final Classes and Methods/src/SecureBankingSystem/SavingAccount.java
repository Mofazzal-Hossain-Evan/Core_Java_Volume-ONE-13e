package SecureBankingSystem;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountHolder, double balance, String accountNumber, double interestRate) {
        super(accountHolder, balance, accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }
}
