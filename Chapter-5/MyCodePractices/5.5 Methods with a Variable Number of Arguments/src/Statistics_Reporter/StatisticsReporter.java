package Statistics_Reporter;

public class StatisticsReporter {
    public static void generateReport(String name, Object... subjectMarks){
        System.out.println("Report for " + name + ":");
        for (int i = 0; i < subjectMarks.length -1; i+= 2){
            String subject = (String) subjectMarks[i];
            int mark = (int) subjectMarks[i +1];

            /*
            চল এটা একটা উদাহরণ দিয়ে ব্যাখ্যা করি, যেখানে i হচ্ছে আমাদের loop-এর index,
             আর আমরা Object... args এর argument গুলো ধরে নিচ্ছি একটি array-এর মতো, য
             েমন: generateReport("Alice", "Math", 87, "English", 91);

             🎯 কেন i + 1: কারণ, subject আর mark দুইটা একসাথে জোড়া থাকে (pair)।
             প্রতি জোড়ায় i হচ্ছে subject, আর i + 1 হচ্ছে mark.
            */

            System.out.println("  "+ subject + "!" + mark);
        }
    }
}
