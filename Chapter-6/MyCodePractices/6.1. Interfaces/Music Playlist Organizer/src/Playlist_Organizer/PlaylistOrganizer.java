package Playlist_Organizer;

import java.util.*;

// মেইন ক্লাস — এখানে user interaction, sorting, এবং playlist generation হবে
public class PlaylistOrganizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // প্রাথমিক কিছু গান অ্যাড করি
        List<Song> playlist = new ArrayList<>(Arrays.asList(
                new Song("Bohemian Rhapsody", "Queen", 355, 4.8),
                new Song("Imagine", "John Lennon", 183, 4.5),
                new Song("Thriller", "Michael Jackson", 357, 4.2)
        ));

        // মেনু চালানো
        while (true) {
            System.out.println("\nPlaylist Organiser:");
            System.out.println("1. Sort by Duration");
            System.out.println("2. Sort by Rating");
            System.out.println("3. Sort by Artist");
            System.out.println("4. Generate Best Of Playlist");
            System.out.println("5. Add New Song");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // new line consume

            switch (choice) {
                case 1:
                    Collections.sort(playlist); // Comparable অনুযায়ী — duration
                    System.out.println("Sorted by Duration:");
                    display(playlist);
                    break;
                case 2:
                    playlist.sort(new RatingComparator()); // রেটিং অনুযায়ী
                    System.out.println("Sorted by Rating:");
                    display(playlist);
                    break;
                case 3:
                    playlist.sort(new ArtistComparator()); // শিল্পী অনুযায়ী
                    System.out.println("Sorted by Artist:");
                    display(playlist);
                    break;
                case 4:
                    System.out.print("Enter number of songs for Best Of: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    generateBestOf(playlist, n);
                    break;
                case 5:
                    addNewSong(playlist, scanner);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // গানগুলো display করার method
    private static void display(List<Song> songs) {
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    // Best Of Playlist তৈরি করার method
    private static void generateBestOf(List<Song> playlist, int n) {
        List<Song> sorted = new ArrayList<>(playlist);
        sorted.sort(new RatingComparator()); // রেটিং অনুযায়ী sort

        System.out.println("Best Of Playlist:");
        for (int i = 0; i < Math.min(n, sorted.size()); i++) {
            System.out.println(sorted.get(i));
        }
    }

    // নতুন গান অ্যাড করার method
    private static void addNewSong(List<Song> playlist, Scanner scanner) {
        try {
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Artist: ");
            String artist = scanner.nextLine();
            System.out.print("Enter Duration (in seconds): ");
            int duration = scanner.nextInt();
            System.out.print("Enter Rating (1.0 to 5.0): ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); // newline consume

            Song newSong = new Song(title, artist, duration, rating);
            playlist.add(newSong);
            System.out.println("Song added!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); // clear buffer
        }
    }
}

