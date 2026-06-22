package Music_Festival_System;

public class MusicFestival {
    public static void main(String[] args) {


        FestivalStore store = new FestivalStore();
        Musician[] musicians = store.getMusicians();


        System.out.println("🎪 Welcome to Music Festival! 🎵");
        System.out.println("👥 Total musicians: " + musicians.length);
        System.out.println();

        // =========================
        // 1. Default ① Optional Behavior — 6.1.5 ★
        // =========================
        System.out.println("=== 1. 🎙️ Default: Optional Behavior (6.1.5) ===");
        System.out.println();
        System.out.println("💡 Iterator.remove() এর মতো:");
        System.out.println("   override করলে custom ✅");
        System.out.println("   না করলে exception ❌");
        System.out.println();

        Singer beyonce = new Singer("🎤 Beyoncé", 10, 50000000, "Pop");
        Drummer moon = new Drummer("🥁 Moon", 10, 10000000, "Rock");
        DJ daft = new DJ("🎧 Daft Punk", 10, 25000000, "Electronic");

        beyonce.recordAlbum();  // override করেছে ✔
        daft.recordAlbum();     // override করেছে ✔

        try{
            moon.recordAlbum();
        } catch (UnsupportedOperationException about_moon){
            System.out.println("❌ Drummer → " +about_moon.getMessage());
        }

        System.out.println();

        // =========================
        // 2. Default ② Convenience — 6.1.5 ★
        // =========================
        System.out.println("=== 2. 🛠️ Default: Convenience Method (6.1.5) ===");
        System.out.println();
        System.out.println("💡 isEmpty() = size()==0 এর মতো:");
        System.out.println("   abstract getSkillLevel() থেকে বানানো");
        System.out.println();

        Singer adele    = new Singer("🎤 Adele",     9, 40000000, "Soul");
        Singer bts      = new Singer("🎤 BTS",       8, 30000000, "K-Pop");
        Guitarist clapton = new Guitarist("🎸 Clapton", 9, 15000000, "Blues");

        System.out.println("Beyoncé(10): isMaster=" + beyonce.isMaster()
                + " → " + beyonce.getReputation());
        System.out.println("BTS(8):      isMaster=" + bts.isMaster()
                + " → " + bts.getReputation());
        System.out.println("Moon(10):    isMaster=" + moon.isMaster()
                + " → " + moon.getReputation());

        System.out.println();

        // =========================
        // 3. Default ③ Interface Evolution — 6.1.5 ★
        // =========================
        System.out.println("=== 3. 🚀 Default: Interface Evolution (6.1.5) ===");
        System.out.println();
        System.out.println("💡 Collection.stream() এর মতো:");
        System.out.println("   streamOnSpotify() পরে যোগ হয়েছে");
        System.out.println("   Singer, Guitarist, Drummer কিছু ভাঙেনি! ✅");
        System.out.println();
        System.out.println("📊 Source vs Binary Compatible:");
        System.out.println("   Abstract method যোগ → ❌ COMPILE ERROR");
        System.out.println("   Default method যোগ  → ✅ সবাই বিনামূল্যে পায়");
        System.out.println();

        beyonce.streamOnSpotify("Spotify 🎧");
        moon.streamOnSpotify("Apple Music 🍎");
        daft.streamOnSpotify("YouTube Music 📺");

        System.out.println();

        // =========================
        // 4. Static Method — 6.1.4
        // =========================
        System.out.println("=== 4. 🔧 Static Method (6.1.4) ===");
        System.out.println();
        System.out.println("💡 Companion Class → Interface Static:");
        System.out.println("   পুরনো: MusicUtils.classify(10)");
        System.out.println("   নতুন:  Playable.classify(10) ✅");
        System.out.println();
        System.out.println("⚠️ Static NOT inherited:");
        System.out.println("   Singer.classify(10) → COMPILE ERROR ❌");
        System.out.println("   Playable.classify(10) → সঠিক ✔");
        System.out.println();

        System.out.println(Playable.classify(10));
        System.out.println(Playable.classify(8));
        System.out.println(Playable.classify(5));
        System.out.println(Playable.classify(2));

        System.out.println("isLegend(10): " + Playable.isLegend(10));
        System.out.println("isLegend(8):  " + Playable.isLegend(8));

        Playable fromType = Playable.fromType("guitarist");
        System.out.println("fromType: " + fromType);

        System.out.println();

        // =========================
        // 5. Private Method DRY — 6.1.4
        // =========================
        System.out.println("=== 5. 🔒 Private Method DRY (6.1.4) ===");
        System.out.println();
        System.out.println("💡 checkNote() একবার — দুটো method এ ব্যবহার:");
        System.out.println();

        System.out.println("canHitNote(High C):   " + beyonce.canHitNote("High C"));
        System.out.println("canHitNote(empty):    " + beyonce.canHitNote(""));
        System.out.println("getNoteStatus(High C):" + beyonce.getNoteStatus("High C"));
        System.out.println("getNoteStatus(empty): " + beyonce.getNoteStatus(""));

        System.out.println();

        // =========================
        // 6. Interface Variable — 6.1.2
        // =========================
        System.out.println("=== 6. 📦 Interface Variable (6.1.2) ===");

        Playable p1 = new Singer("🎤 Adele",         9, 40000000, "Soul");
        Playable p2 = new DJ("🎧 Calvin Harris",      9, 20000000, "EDM");

        p1.play("Hello 🎵");
        p2.play("Summer 🎵");

        System.out.println();

        // =========================
        // 7. instanceof check — 6.1.2
        // =========================
        System.out.println("=== 7. 🔍 instanceof Check (6.1.2) ===");

        for (Musician m : musicians) {
            if (m instanceof Singable) {
                System.out.println(m.getName() + " can sing 🎤");
            }
            if (m instanceof Strummable) {
                System.out.println(m.getName() + " can strum 🎸");
            }
            if (m instanceof Beatable) {
                System.out.println(m.getName() + " can beat 🥁");
            }
        }

        System.out.println();



        // =========================
        // 9. Constant check — 6.1.2
        // =========================
        System.out.println("=== 9. 📏 Constant Check (6.1.2) ===");

        int safeBPM   = 150;
        int dangerBPM = 250;

        if (safeBPM > Beatable.MAX_BPM) {
            System.out.println("🥁 " + safeBPM + " BPM → TOO FAST ❌");
        } else {
            System.out.println("🥁 " + safeBPM + " BPM → Safe ✅");
        }

        if (dangerBPM > Beatable.MAX_BPM) {
            System.out.println("🥁 " + dangerBPM + " BPM → TOO FAST ❌");
        } else {
            System.out.println("🥁 " + dangerBPM + " BPM → Safe ✅");
        }

        System.out.println("MAX_NOTE  = " + Singable.MAX_NOTE);
        System.out.println("MAX_CHORD = " + Strummable.MAX_CHORD);
        System.out.println("MAX_BPM   = " + Beatable.MAX_BPM);

        System.out.println();

        // =========================
        // 10. Multiple implements — 6.1.3
        // =========================
        System.out.println("=== 10. 🎧 Multiple Implements (6.1.3) ===");
        System.out.println("💡 DJ — Singable + Strummable দুটো!");
        System.out.println();

        DJ calvinHarris = new DJ("🎧 Calvin Harris", 9, 20000000, "EDM");
        calvinHarris.sing("We Found Love 🎤");
        calvinHarris.strum("Dm7 🎸");
        calvinHarris.play("Summer 🎵");

        System.out.println();

        // =========================
        // 11. Sealed Interface — 6.1.2
        // =========================
        System.out.println("=== 11. 🔒 Sealed Interface (6.1.2) ===");

        MusicBehavior mb1 = new Singer("🎤 Adele",       9, 40000000, "Soul");
        MusicBehavior mb2 = new DJ("🎧 Daft Punk",      10, 25000000, "Electronic");

        System.out.println("Adele genre:    " + mb1.getGenre());
        System.out.println("Daft Punk genre:" + mb2.getGenre());
        System.out.println("instanceof:     " + (mb1 instanceof MusicBehavior));

        System.out.println(((Singer) mb1).name);

        System.out.println();

        // =========================
        // 12. Comparable variable — 6.1.2
        // =========================
        System.out.println("=== 12. ⚖️ Comparable Variable (6.1.2) ===");

        Comparable<Singer> cs1 = new Singer("🎤 Beyoncé", 10, 50000000, "Pop");
        Comparable<Singer> cs2 = new Singer("🎤 Adele",    9, 40000000, "Soul");

        int result = cs1.compareTo((Singer) cs2);

        if      (result > 0) System.out.println("⚖️ Beyoncé more skilled 💪");
        else if (result < 0) System.out.println("⚖️ Adele more skilled 💪");
        else                 System.out.println("⚖️ Equal skill! 🤝");

        System.out.println();

        // =========================
        // 13. Pattern Matching — 6.1.2
        // =========================
        System.out.println("=== 13. 🎯 Pattern Matching (6.1.2) ===");

        Object[] mixed = {
                new Singer("🎤 BTS",             8, 30000000, "K-Pop"),
                new Guitarist("🎸 Clapton",       9, 15000000, "Blues"),
                new Drummer("🥁 Peart",           9,  8000000, "Progressive"),
                new DJ("🎧 Calvin Harris",         9, 20000000, "EDM"),
                "🎵 Random String",
                42
        };

        for (Object item : mixed) {
            if (item instanceof Beatable b) {
                b.beat(120);
            } else if (item instanceof Singable s) {
                s.sing("La la la 🎵");
            } else if (item instanceof Strummable st) {
                st.strum("Am 🎸");
            } else if (item instanceof Comparable<?>) {
                System.out.println("📊 Comparable: "
                        + item.getClass().getSimpleName());
            } else {
                System.out.println("❓ Unknown → " + item);
            }
        }

        System.out.println();

        // =========================
        // 14. CharSequence idea — 6.1.3
        // =========================
        System.out.println("=== 14. 🌐 CharSequence Idea (6.1.3) ===");

        System.out.println("--- Part A: Universal Remote 🎛️ ---");
        showMusicianInfo(new Singer("🎤 Adele",          9, 40000000, "Soul"));
        showMusicianInfo(new Guitarist("🎸 Hendrix",     10, 20000000, "Rock"));
        showMusicianInfo(new Drummer("🥁 Moon",          10, 10000000, "Rock"));
        showMusicianInfo(new DJ("🎧 Daft Punk",          10, 25000000, "Electronic"));

        System.out.println();

        System.out.println("--- Part B: subSequence idea 🔗 ---");

        Playable singerP    = new Singer("🎤 Beyoncé",    10, 50000000, "Pop");
        Playable guitarP    = new Guitarist("🎸 Hendrix",  10, 20000000, "Rock");
        Playable djP        = new DJ("🎧 Daft Punk",       10, 25000000, "Electronic");

        Playable backup1 = singerP.getBackup();
        Playable backup2 = guitarP.getBackup();
        Playable backup3 = djP.getBackup();

        backup1.play("Backup song 🎵");
        backup2.play("Backup riff 🎸");
        backup3.play("Backup mix 🎧");

        System.out.println();
        System.out.println("🎉 6.1.5 + 6.1.4 + 6.1.3 + 6.1.2 — All covered! 🎵🎸🎤🥁");
    }

    // CharSequence Universal Remote idea
    // Playable parameter → Singer, Guitarist, Drummer, DJ সব চলে
    public static void showMusicianInfo(Playable p) {
        System.out.println("🎵 --- Musician Info ---");
        p.play("Festival Song 🎪");
        try {
            p.recordAlbum();
        } catch (UnsupportedOperationException e) {
            System.out.println("ℹ️ " + e.getMessage());
        }

    }
}
