package Music_Festival_System;

public non-sealed abstract class Musician implements
        MusicBehavior{

    protected String name;
    protected int skillLevel;
    protected int fans;
    protected String genre;

    public Musician(String pName, int pSkillLevel, int pFans, String pGenre) {
        name       = pName;
        skillLevel = pSkillLevel;
        fans       = pFans;
        genre      = pGenre;
    }

    public String getName() {
        return name;
    }

    public int getskillLevel() {
        return skillLevel;
    }

    public int getFans() {
        return fans;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    public abstract String getMusicianType();

    @Override
    public String toString() {
        return getMusicianType() +
                "[" + name +
                " 🎵Skill:" + skillLevel +
                " 👥Fans:" + fans + "]";
    }
}

