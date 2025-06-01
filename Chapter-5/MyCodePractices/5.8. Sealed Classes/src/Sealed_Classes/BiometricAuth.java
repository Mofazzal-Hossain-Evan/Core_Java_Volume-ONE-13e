package Sealed_Classes;

import java.util.Scanner;

final class BiometricAuth implements AuthenticationMethod {
    private final String registeredFingerprint = "FINGERPRINT_HASH";

    @Override
    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place your finger on the scanner (simulate by typing 'FINGERPRINT_HASH'):");
        String input = scanner.nextLine();
        return input.equals(registeredFingerprint);
    }
}
