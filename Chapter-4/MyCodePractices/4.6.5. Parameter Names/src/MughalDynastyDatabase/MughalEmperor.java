package MughalDynastyDatabase;

public class MughalEmperor {

    private String name;
    private int reignStartYear;
    private int reignEndYear;
    private String majorAchievements;

    // Constructor with single-letter parameters

    public MughalEmperor(String n, int s, int e, String a) {
        name = n;
        reignEndYear = e;
        reignStartYear = s;
        majorAchievements = a;
    }

    // Constructor with "a" prefix parameters
    public MughalEmperor(String aName, int aEndYear, int aStartYear, String aAchivements) {
        name = aName;
        reignStartYear = aStartYear;
        reignEndYear = aEndYear;
        majorAchievements = aAchivements;
    }

    // Constructor using "this" keyword to avoid shadowing
    public MughalEmperor(String name, int regionStartYear, int regionEndYear, String majorAchievements) {
        this.majorAchievements = majorAchievements;
        this.name = name;
        this.reignEndYear = regionEndYear;
        this.reignStartYear = regionStartYear;
    }

    public void displayInfo() {
        System.out.println("Emperor: " + name);
        System.out.println("Reign: " + reignStartYear + " - " + reignEndYear);
        System.out.println("Major Achievements: " + majorAchievements);
        System.out.println("---------------------------------");
    }
}
