package Music_Festival_System;

public non-sealed interface Playable extends MusicBehavior{

    void play(String song);
    int getSkillLevel();
    Playable getBackup();

    // =====================
    // 6.1.5 ① Optional Behavior
    // Iterator.remove() এর মতো
    // Singer + Guitarist override করে
    // Drummer করে না → exception
    // =====================

    default void recordAlbum(){
        throw new UnsupportedOperationException(
                getGenre()  + " musician doesn't record! 🚫");
    }

    // =====================
    // 6.1.5 ② Convenience Method
    // isEmpty() = size()==0 এর মতো
    // abstract getSkillLevel() থেকে বানানো
    // =====================

    default boolean isMaster(){
        return getSkillLevel() >= 9;
    }

    default String getReputation(){
        return isMaster()
                ? "🌟 LEGEND of the stage!"
                : "🎵 Still rocking...";
    }

    // =====================
    // 6.1.5 ③ Interface Evolution
    // Collection.stream() এর মতো
    // পরে যোগ করা হয়েছে
    // Singer, Guitarist, Drummer — কিছু ভাঙেনি ✅
    // Abstract হলে সব COMPILE ERROR ❌
    // =====================

    default void streamOnSpotify(String platform){
        System.out.println("🎧 " + getGenre() +
                " now streaming on " + platform + "! 🎵" );
    }

    // =====================
    // 6.1.4 Static Methods
    // Playable.classify(10) — object লাগে না
    // =====================
    static String classify(int level){
        return getTier(level);
    }
    static boolean isLegend(int level){
        return checkLegend(level);
    }

    static Playable fromType(String type){
        return switch (type){
            case "singer"    -> new Singer("🎤 Default",    7, 1000, "Pop");
            case "guitarist" -> new Guitarist("🎸 Default", 8, 800,  "Rock");
            case "drummer"   -> new Drummer("🥁 Default",   6, 500,  "Jazz");
            default          -> new Singer(type,             1, 0,    "Unknown");
        };
    }
    // =====================
    // 6.1.4 Private Static
    // =====================

    private static boolean checkLegend(int level){
        return level >= 10;
    }

    private static String getTier(int level){
        if      (level >= 10) return "🔥 ROCKSTAR";
        else if (level >= 8)  return "⭐ PROFESSIONAL";
        else if (level >= 5)  return "🎵 INTERMEDIATE";
        else                  return "🌱 BEGINNER";

    }

}

