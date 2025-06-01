package RandomNameGenerator;

import java.util.Random;

public class UsernameGenerator {

    private static String[] prefixes = {"Cool", "Epic", "Mighty", "Swift", "Brave"};
    private static String[] suffixes = {"Dragon", "Tiger", "Eagle", "Panther", "Shark"};

    public static String generateUserName(){
        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String sufix = suffixes[random.nextInt(suffixes.length)];

        int number= random.nextInt(500);
        return prefix + sufix + number;
    }
    public static void main(String[] args) {
        System.out.println("Generated Username: " + UsernameGenerator.generateUserName());
    }
}
