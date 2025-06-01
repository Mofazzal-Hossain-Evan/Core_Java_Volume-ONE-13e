package ChatBo_with_Safe_User_Input;

import java.util.Objects;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Name pls");
        var name = scanner.nextLine();

        name = Objects.requireNonNullElse(name.trim().isEmpty() ? null : name, "Guest");

        System.out.println("Hello, " + name + "! How can I assist you today?");

        scanner.close();
    }
}
