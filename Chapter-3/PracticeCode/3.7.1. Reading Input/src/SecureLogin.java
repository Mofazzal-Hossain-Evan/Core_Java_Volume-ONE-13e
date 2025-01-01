import java.io.Console;
import java.util.Arrays;

public class SecureLogin {

    public static void main(String[] args) {
        Console Cnsl = System.console();

        if(Cnsl == null) {
            System.out.println("No console available. Please run this program in a terminal.");
        }

        String username = Cnsl.readLine("Enter username: ");
        char[] password = Cnsl.readPassword("Enter password: ");


        System.out.println("Processing login...");
                if(validateCredentials(username, password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password.");
        }

                Arrays.fill(password, '*');
        System.out.println("Password data cleared for security.");
    }

    private static boolean validateCredentials(String username, char[] password) {
        // Example: Username is "user" and password is "pass" for demonstration
        String validUsername = "user";
        char[] validPassword = {'p', 'a', 's', 's'};

        return  username.equals(validUsername) && Arrays.equals(password, validPassword);

    }
}
