package SimpleBankingSystem;

public class BankingApp {
    public static void main(String[] args) {
        var acc1 = new BankAccount("me", 70090);
        var acc2 = new BankAccount("you", 90458406);

        acc1.deposit(300);
        acc2.deposit(344);

        acc1.displayBalance();
        acc2.displayBalance();
    }
}
