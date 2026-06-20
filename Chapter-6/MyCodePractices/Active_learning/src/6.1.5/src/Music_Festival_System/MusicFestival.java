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
    }
}
