import java.util.Scanner;

public class BankingSimulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = input.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                        continue;
                    }
                    balance -= withdrawal;
                    System.out.println("Withdrawal successful.");
                }
                case 3 -> {
                    System.out.println("Your current balance is: $" + balance);
                }
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                }
                default -> System.out.println("Invalid option. Try again.");
            }

            if (choice == 4) {
                break;
            }

        }
        input.close();
    }

}
