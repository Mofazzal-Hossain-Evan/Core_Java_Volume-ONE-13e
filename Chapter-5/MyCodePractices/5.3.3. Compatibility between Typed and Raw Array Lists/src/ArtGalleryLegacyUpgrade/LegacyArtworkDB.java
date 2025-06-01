package ArtGalleryLegacyUpgrade;

import java.util.ArrayList;

public class LegacyArtworkDB {
    // পুরনো ডেটা ফেরত দেয়, কোন টাইপ স্পেসিফাই করা হয়নি
    public ArrayList getLegacyData(){
        ArrayList legacyList = new ArrayList();

        // কিছু valid legacy ডেটা
        legacyList.add(new LegacyArtwork("Sunset Melody", "Ravi", 1995));
        legacyList.add(new LegacyArtwork("Ocean Dreams", "Lila", 2001  ));

        // একটি ভুল এন্ট্রি
        legacyList.add("Corrupted entry");

        // আরেকটি valid
        legacyList.add(new LegacyArtwork("Urban Shadows", "Nabil", 2010));

        return legacyList;
    }
}
