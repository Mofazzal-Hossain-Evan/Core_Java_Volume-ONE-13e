package BankAccountManagementSystem;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("name: imran",
                "1234",23434231);

        acc1.displayBalance();
        acc1.deposit(500000000);
        acc1.withdraw(4334);
        acc1.displayBalance();
    }
}
