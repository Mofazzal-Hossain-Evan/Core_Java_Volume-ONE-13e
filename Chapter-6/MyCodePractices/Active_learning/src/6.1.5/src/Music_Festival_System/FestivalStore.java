package Music_Festival_System;



public class FestivalStore {

    private Musician[] musicians;

    public FestivalStore() {
        musicians = new Musician[]{

                // 🎤 Singers
                new Singer("🎤 Beyoncé",   10, 50000000, "Pop"),
                new Singer("🎤 Adele",      9, 40000000, "Soul"),
                new Singer("🎤 BTS",        8, 30000000, "K-Pop"),

                // 🎸 Guitarists
                new Guitarist("🎸 Hendrix", 10, 20000000, "Rock"),
                new Guitarist("🎸 Clapton",  9, 15000000, "Blues"),

                // 🥁 Drummers
                new Drummer("🥁 Moon",      10, 10000000, "Rock"),
                new Drummer("🥁 Peart",      9,  8000000, "Progressive"),

                // 🎧 DJs
                new DJ("🎧 Daft Punk",      10, 25000000, "Electronic"),
                new DJ("🎧 Calvin Harris",   9, 20000000, "EDM")
        };
    }

    public Musician[] getMusicians() {
        return musicians;
    }
}