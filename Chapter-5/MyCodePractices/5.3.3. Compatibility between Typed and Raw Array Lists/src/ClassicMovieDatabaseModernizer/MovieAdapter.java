package ClassicMovieDatabaseModernizer;

import java.util.ArrayList;
import java.util.Objects;

// এই ক্লাস raw list কে typed list (ArrayList<Movie>) এ কনভার্ট করে
public class MovieAdapter {

    public ArrayList<Movie> convertToModernList(ArrayList rawList) {
        ArrayList<Movie> modernList = new ArrayList<>();

        for (Object o : rawList) {
            if (o instanceof LegacyMovie){
            LegacyMovie legacy = (LegacyMovie) o;
            Movie modern = new Movie(legacy);
            modernList.add(modern);
        } else{
            System.out.println("⚠️ Skipped invalid entry: " + o);

        }
    }
        return modernList;

    }

    }

