import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileOperationMenu {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nFile Operation Menu:");
            System.out.println("1. Write to a file");
            System.out.println("2. Read from a file");
            System.out.println("3. Check current directory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();// Consume newline

            switch (choice) {
                case 1 -> writeToFile();
                case 2 -> readFromFile();
                case 3 -> System.out.println("Current directory: " + System.getProperty("user.dir"));
                case 4 -> {
                    System.out.println("Exiting program. Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        input.close();
    }

    private static void writeToFile() throws IOException {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the file name to write to: ");
        String fileName = input2.nextLine();

        System.out.print("Enter the content to write: ");
        String content = input2.nextLine();

        try (PrintWriter writer = new PrintWriter(fileName, StandardCharsets.UTF_8)) {
            writer.println(content);
        }
        System.out.println("Content written to " + fileName);
    }

    private static void readFromFile() {
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the file name to read from: ");
        String fileName = input3.nextLine();

        try (Scanner fileScanner = new Scanner(Path.of(fileName), StandardCharsets.UTF_8)) {
            System.out.println("\nFile contents:");
            while (fileScanner.hasNextLine()) ;
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

