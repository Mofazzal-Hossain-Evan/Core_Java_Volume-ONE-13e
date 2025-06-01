package ArtGalleryLegacyUpgrade;

import java.util.ArrayList;

public class ArtGallerySystem {
    public static void main(String[] args) {
        System.out.println("\u001B[35m🎨 Modern Art Collection 🎨\u001B[0m\n");

        LegacyArtworkDB legacyDB = new LegacyArtworkDB();
        ArrayList rawList = legacyDB.getLegacyData();

        ArtworkAdapter adapter = new  ArtworkAdapter();
        ArrayList<Artwork> modernList = adapter.convertTOModernList(rawList);

        for (Artwork artwork : modernList){
            System.out.println("\u001B[34m" + artwork + "\u001B[0m"); // Blue color

        }
    }
}
