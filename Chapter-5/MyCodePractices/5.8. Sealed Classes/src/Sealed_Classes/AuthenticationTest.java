package Sealed_Classes;

import java.util.Scanner;

public class AuthenticationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Authentication Method:");
        System.out.println("1. Password");
        System.out.println("2. OTP");
        System.out.println("3. Biometric");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // consume newline

        AuthenticationMethod authMethod;

        switch (choice){
            case 1 -> authMethod = new PasswordAuth();
            case  2 -> authMethod = new OTPAuth();
            case 3 -> authMethod = new BiometricAuth();
            default -> {
                System.out.println("Invalid choice.");
                return;
            }

        }

        if (authMethod.authenticate()){
            System.out.println("✅ Authentication successful!");
        } else {
            System.out.println("❌ Authentication failed!");
        }
    }
}
