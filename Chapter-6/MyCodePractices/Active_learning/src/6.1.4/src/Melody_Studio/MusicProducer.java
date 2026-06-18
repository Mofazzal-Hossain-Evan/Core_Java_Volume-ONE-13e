package Melody_Studio;

public non-sealed interface MusicProducer extends MusicBehavior {

    void produceTrack(String songName);
    void mixAudio(int quality);

    // =====================
    // Static Methods (6.1.4)
    // =====================
    static String getGenreTier(String genre) {
        return getTierName(genre);
    }

    static boolean isHitPotential(int streams) {
        return checkHitPotential(streams);
    }

    // Factory Method
    static MusicProducer createProducer(String style) {
        return switch (style.toLowerCase()) {
            case "pop"   -> new PopProducer("🎤 Taylor", "Pop");
            case "rock"  -> new RockProducer("🎸 David", "Rock");
            case "lofi"  -> new LofiProducer("🌙 Chill", "LoFi");
            default      -> new PopProducer("New Artist", "Pop");
        };
    }

    // Private Static Helpers
    private static String getTierName(String genre) {
        return switch (genre.toLowerCase()) {
            case "pop"  -> "🌟 MAINSTREAM";
            case "rock" -> "🔥 LEGENDARY";
            case "lofi" -> "☁️ CHILL VIBES";
            default     -> "🎵 INDIE";
        };
    }

    private static boolean checkHitPotential(int streams) {
        return streams > 1_000_000;
    }

    // =====================
    // Default Methods + Private Method (DRY)
    // =====================
    default void applyAutoTune(int pitch) {
        if (checkPitchQuality(pitch)) {
            System.out.println("🎛️ Auto-tune applied smoothly!");
        } else {
            System.out.println("⚠️ Pitch needs adjustment.");
        }
    }

    default String getProductionReport(int quality) {
        if (checkPitchQuality(quality)) {
            return "✅ Professional Quality Track";
        } else {
            return "🔧 Needs more mixing";
        }
    }

    // Private Helper (দুটো default method-ই এটা ব্যবহার করে — DRY)
    private boolean checkPitchQuality(int value) {
        return value >= 80;
    }
}