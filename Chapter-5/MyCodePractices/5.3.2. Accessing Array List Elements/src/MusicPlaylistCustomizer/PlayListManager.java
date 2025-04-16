package MusicPlaylistCustomizer;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayListManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Song> playlist = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("\n🎧 Playlist Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Insert Song at Position");
            System.out.println("3. Remove Song");
            System.out.println("4. Update Song");
            System.out.println("5. View Playlist");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Duration: ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine();
                    playlist.add(new Song(title, artist, duration));
                    System.out.println("✅ Song added.");
                }
                case 2 -> {
                    System.out.print("Position: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Duration: ");
                    double duration = scanner.nextDouble();scanner.nextLine();
                    if (index >= 0 && index <= playlist.size()){
                        playlist.add(index, new Song(title, artist, duration));
                        System.out.println("✅ Song inserted.");
                    } else {
                        System.out.println("❌ Invalid index.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter index to remove: ");
                    int index = scanner.nextInt(); scanner.nextLine();
                    if (index >= 0 && index < playlist.size()){
                        playlist.remove(index);
                        System.out.println("🗑️ Song removed.");
                    } else {
                        System.out.println("❌ Invalid index.");
                    }
                }

                case 4 -> {
                    System.out.print("Index to update: ");
                    int index = scanner.nextInt(); scanner.nextLine();
                    if (index >= 0 && index < playlist.size()) {
                        System.out.print("New Title: ");
                        String title = scanner.nextLine();
                        System.out.print("New Artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("New Duration: ");
                        double duration = scanner.nextDouble(); scanner.nextLine();
                        playlist.set(index, new Song(title, artist, duration));
                        System.out.println("✅ Song updated.");
                    } else {
                        System.out.println("❌ Invalid index.");
                    }
                }
                case 5 -> {
                    System.out.println("\n🎶 Playlist:");
                    for (int i = 0; i < playlist.size(); i++) {
                        System.out.println(i + ": " + playlist.get(i));
                    }
                }
                case 6 -> running = false;
                default -> System.out.println("❗ Invalid option.");
            }
        }
        System.out.println("👋 Goodbye!");




    }
}
