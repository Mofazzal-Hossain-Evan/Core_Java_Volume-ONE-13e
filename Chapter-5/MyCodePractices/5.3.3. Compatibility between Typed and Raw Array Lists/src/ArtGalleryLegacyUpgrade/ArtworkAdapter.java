package ArtGalleryLegacyUpgrade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ArtworkAdapter {
    // raw list কে ArrayList<Artwork> এ রূপান্তর করে

    //@SuppressWarnings("unchecked")
    public ArrayList<Artwork> convertTOModernList(ArrayList rawList){
        ArrayList<Artwork> modernList = new ArrayList<>();

        for (Object o : rawList){
            if (o instanceof LegacyArtwork){
                LegacyArtwork legacy = (LegacyArtwork) o;
                Artwork modern = new Artwork(legacy);
                modernList.add(modern);
            } else {
                System.out.println("⚠️ Skipped corrupted entry");
            }
        }
        return modernList;
    }
}
