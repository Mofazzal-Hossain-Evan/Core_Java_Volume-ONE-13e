package Music_Festival_System;


public final class Singer extends Musician
        implements Singable, Comparable<Singer> {

    public Singer(String pName, int pSkillLevel,
                  int pFans, String pGenre) {
        super(pName, pSkillLevel, pFans, pGenre);
    }

    @Override
    public String getMusicianType() { return "🎤 Singer"; }

    @Override
    public void play(String song) {
        System.out.println("🎤 " + name +
                " performs: " + song + " 🎵");
    }

    @Override
    public int getSkillLevel() {
        return 0;
    }

    @Override
    public void sing(String lyrics) {
        System.out.println("🎤 " + name +
                " sings: ♪ " + lyrics + " ♪");
    }

    // 6.1.5 ① override করেছে
    @Override
    public void recordAlbum() {
        System.out.println("🎤 " + name +
                " recording platinum album! 💿🌟");
    }

    @Override
    public Playable getBackup() {
        return new Singer("🎤 Backup " + name,
                skillLevel - 2, fans / 2, genre);
    }

    @Override
    public int compareTo(Singer other) {
        return Integer.compare(skillLevel, other.skillLevel);
    }
}