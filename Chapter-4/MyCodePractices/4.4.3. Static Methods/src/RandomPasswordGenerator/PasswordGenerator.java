package RandomPasswordGenerator;

import java.util.Random;

public class PasswordGenerator {
    private static final String CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generatePassword(int length){
        Random random = new Random();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i <length; i++){
            int index = random.nextInt(CHAR.length());
            pass.append(CHAR.charAt(index));
        }
        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated Pass: " + PasswordGenerator.generatePassword(5) );
    }
}
