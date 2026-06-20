package Music_Festival_System;



public final class Guitarist extends Musician
        implements Strummable, Comparable<Guitarist> {

    public Guitarist(String pName, int pSkillLevel,
                     int pFans, String pGenre) {
        super(pName, pSkillLevel, pFans, pGenre);
    }

    @Override
    public String getMusicianType() { return "🎸 Guitarist"; }

    @Override
    public void play(String song) {
        System.out.println("🎸 " + name +
                " shreds: " + song + " 🤘");
    }

    @Override
    public int getSkillLevel() {
        return 0;
    }

    @Override
    public void strum(String chord) {
        if (chord.length() > MAX_CHORD) {
            System.out.println("🎸 " + name + " → Too complex! ❌");
        } else {
            System.out.println("🎸 " + name +
                    " strums: " + chord + " 🎵");
        }
    }

    // 6.1.5 ① override করেছে
    @Override
    public void recordAlbum() {
        System.out.println("🎸 " + name +
                " recording guitar solo album! 💿🎸");
    }

    @Override
    public Playable getBackup() {
        return new Guitarist("🎸 Backup " + name,
                skillLevel - 1, fans / 2, genre);
    }

    @Override
    public int compareTo(Guitarist other) {
        return Integer.compare(skillLevel, other.skillLevel);
    }
}

