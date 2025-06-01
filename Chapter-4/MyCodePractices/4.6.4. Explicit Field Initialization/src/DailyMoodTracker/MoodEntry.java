package DailyMoodTracker;

public class MoodEntry {

    private static  int nextId = 1;
    private int entryId = generateEntryId();
    private  String mood = "Natural";
    private long timestamp = generateTimeStamp();

    private static int generateEntryId(){
        return nextId++;
    }

    private static long generateTimeStamp(){
        return System.currentTimeMillis();
    }

    public MoodEntry(){}

    public MoodEntry(String mood){
        this.mood = mood;
    }

    public void displayMoodEntry(){
        System.out.println("Entry ID: " + entryId);
        System.out.println("Mood: " + mood);
        System.out.println("Timestamp: " + timestamp);
    }

    public static void main(String[] args) {
        MoodEntry e1 = new MoodEntry();
        MoodEntry e2 = new MoodEntry("Best");

        e1.displayMoodEntry();
        System.out.println();
        e2.displayMoodEntry();
    }

}
