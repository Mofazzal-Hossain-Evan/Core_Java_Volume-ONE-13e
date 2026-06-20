package Music_Festival_System;



public final class DJ extends Musician
        implements Singable, Strummable, Comparable<DJ> {

    // 💡 6.1.3 — দুটো interface একসাথে
    // Singable body নেই, Strummable body নেই
    // DJ নিজে লেখে → Diamond Problem নেই
    // class DJ extends Singable, Strummable → ERROR!

    public DJ(String pName, int pSkillLevel,
              int pFans, String pGenre) {
        super(pName, pSkillLevel, pFans, pGenre);
    }

    @Override
    public String getMusicianType() { return "🎧 DJ"; }

    @Override
    public void play(String song) {
        System.out.println("🎧 " + name +
                " drops: " + song + " 🔊💥");
    }

    @Override
    public int getSkillLevel() {
        return 0;
    }

    @Override
    public void sing(String lyrics) {
        System.out.println("🎧 " + name +
                " hypes: ♪ " + lyrics + " ♪ 🎤");
    }

    @Override
    public void strum(String chord) {
        System.out.println("🎧 " + name +
                " scratches: " + chord + " 🎵");
    }

    @Override
    public void recordAlbum() {
        System.out.println("🎧 " + name +
                " drops fire mixtape! 💿🔥");
    }

    @Override
    public Playable getBackup() {
        return new DJ("🎧 Backup " + name,
                skillLevel - 2, fans / 2, genre);
    }

    @Override
    public int compareTo(DJ other) {
        return Integer.compare(skillLevel, other.skillLevel);
    }
}