package Music_Festival_System;



public final class Drummer extends Musician
        implements Beatable, Comparable<Drummer> {

    public Drummer(String pName, int pSkillLevel,
                   int pFans, String pGenre) {
        super(pName, pSkillLevel, pFans, pGenre);
    }

    @Override
    public String getMusicianType() { return "🥁 Drummer"; }

    @Override
    public void play(String song) {
        System.out.println("🥁 " + name +
                " drums to: " + song + " 🔥");
    }

    @Override
    public int getSkillLevel() {
        return 0;
    }

    @Override
    public void beat(int bpm) {
        if (bpm > MAX_BPM) {
            System.out.println("🥁 " + name +
                    " → Too fast! MAX=" + MAX_BPM + " ❌");
        } else {
            System.out.println("🥁 " + name +
                    " beats at " + bpm + " BPM 🔥");
        }
    }

    // 6.1.5 ① override করেনি
    // → default throws UnsupportedOperationException
    // → Optional behavior এর উদাহরণ

    @Override
    public Playable getBackup() {
        return new Drummer("🥁 Backup " + name,
                skillLevel - 1, fans / 3, genre);
    }

    @Override
    public int compareTo(Drummer other) {
        return Integer.compare(skillLevel, other.skillLevel);
    }
}