package Sealed_Classes;

import java.util.Scanner;

final class OTPAuth implements AuthenticationMethod {
    private final String generatedOTP = "456789";

    @Override
    public  boolean authenticate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OTP:");
        String input = scanner.nextLine();
        return input.equals(generatedOTP);
    }
}
