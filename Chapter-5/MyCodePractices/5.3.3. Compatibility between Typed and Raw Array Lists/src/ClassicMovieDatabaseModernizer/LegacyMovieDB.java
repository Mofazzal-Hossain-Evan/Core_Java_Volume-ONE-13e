package ClassicMovieDatabaseModernizer;

import java.util.ArrayList;

// এটি পুরনো ডেটাবেইস ক্লাস যা raw ArrayList রিটার্ন করে
public class LegacyMovieDB {

    // টাইপ ছাড়া রিটার্ন করা হচ্ছে (raw list)
    public ArrayList getLegacyMovies() {
        ArrayList legacyList = new ArrayList();

        // কিছু valid legacy মুভি
        legacyList.add(new LegacyMovie("The Silent Voice", "Kurosawa", 1954));
        legacyList.add(new LegacyMovie("Moonlight Sonata", "Luna", 1963));

        legacyList.add("false data");

        legacyList.add(new LegacyMovie("Golden Horizon", "Amal", 1972));

        return legacyList;

    }
}