package Sealed_Classes;

import javax.swing.*;
import java.util.Scanner;

final class PasswordAuth implements  AuthenticationMethod {

    private final String correctPassword = "secret123";

    @Override
    public boolean authenticate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String input = scanner.nextLine();
        return input.equals(correctPassword);
    }
}
