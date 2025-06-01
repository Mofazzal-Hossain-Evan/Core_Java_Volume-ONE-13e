package ClassicMovieDatabaseModernizer;

import java.util.ArrayList;

public class MovieDatabaseSystem {
    public static void main(String[] args) {
        System.out.println("\u001B[35m🎬 Modernized Classic Movie List 🎬\u001B[0m\n");

        //old data field
        LegacyMovieDB legacyDB = new LegacyMovieDB();
        ArrayList rawList = legacyDB.getLegacyMovies();

        // কনভার্ট করে মডার্ন লিস্টে নেওয়া
        MovieAdapter adapter = new MovieAdapter();
        ArrayList<Movie> modernList = adapter.convertToModernList(rawList);

        // রঙিন ভাবে মুভিগুলো প্রিন্ট
        for (Movie movie : modernList) {
            System.out.println(movie);
        }
    }
}
