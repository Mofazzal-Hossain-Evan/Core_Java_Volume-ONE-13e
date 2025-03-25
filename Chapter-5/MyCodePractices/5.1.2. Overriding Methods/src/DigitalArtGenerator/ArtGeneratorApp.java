package DigitalArtGenerator;

import java.util.Scanner;

public class ArtGeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Art Type: (1) Pixel Art, (2) Abstract Art, (3) AI-Generated Art");
        int choice = scanner.nextInt();

        System.out.println("Enter complexity level (3-10): ");
        int complexity = scanner.nextInt();
        if (complexity < 3 || complexity > 10) {
            System.out.println("Invalid complexity! Defaulting to 5.");
            complexity = 5;
        }
        ArtGenerator art;
        switch (choice) {
            case 1:
                art = new PixelArt(complexity);
                break;
            case 2:
                art = new AbstractArt(complexity);
                break;
            case 3:
                art = new AIGeneratedArt(complexity);
                break;
            default:
                System.out.println("Invalid");
                art = new PixelArt(complexity);
        }
        String generatedArt = art.generateArt();
        System.out.println(generatedArt);

        System.out.println( "Do you want to save the art? (yes/no): ");
        String save = scanner.next();
        if (save.equalsIgnoreCase("yes")){
            art.saveArtToFile(generatedArt, "GeneratedArt.txt");
        }
        scanner.close();
    }
}
