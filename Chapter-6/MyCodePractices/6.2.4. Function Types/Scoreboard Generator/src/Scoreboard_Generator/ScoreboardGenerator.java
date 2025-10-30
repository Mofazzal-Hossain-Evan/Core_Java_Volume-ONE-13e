/* Package declaration */
package Scoreboard_Generator;

import java.util.*;
import java.util.function.*;
import javax.swing.Timer;

/* থিয়রি: *Core Java* (p. 274) — IntFunction অবজেক্ট ক্রিয়েশনের জন্য, BiFunction কম্বাইনের জন্য। */

public class ScoreboardGenerator {
    public static void main(String[] args) {
        // ১. লেজি এন্ট্রি জেনারেটর (IntFunction)
        IntFunction<ScoreEntry> entryGenerator =
                score -> new ScoreEntry("Player " + score, score);

        // ২. কাস্টম এন্ট্রি (BiFunction)
        BiFunction<String, Integer, ScoreEntry> customEntry =
                (name, score) -> new ScoreEntry(name, score);

        // ৩. স্কোর অ্যারে ইনিশিয়ালাইজ (IntUnaryOperator + Arrays.setAll)
        IntUnaryOperator scoreOp = i -> i * 10;
        int numPlayers = 5;
        int[] scores = new int[numPlayers];
        Arrays.setAll(scores, scoreOp);

        // ৪. লিস্টে এন্ট্রি যোগ করা
        List<ScoreEntry> leaderboard = new ArrayList<>();
        for (int s : scores) {
            leaderboard.add(entryGenerator.apply(s));
        }

        // ৫. মজার প্লেয়ার যোগ করা
        leaderboard.add(customEntry.apply("Score Sorcerer", 150));
        leaderboard.add(customEntry.apply("Pixel Paladin", 80));
        leaderboard.add(customEntry.apply("Code Wizard", 120));

        System.out.println("Initial Leaderboard:");
        leaderboard.forEach(System.out::println);
        System.out.println();

        // ৬. লো স্কোর ফেলে দেওয়া (Predicate + removeIf)
        Predicate<ScoreEntry> lowScore = entry -> entry.getScore() < 50;
        leaderboard.removeIf(lowScore);

        System.out.println("After removing low scores:");
        leaderboard.forEach(System.out::println);
        System.out.println();

        // ৭. স্কোর অনুযায়ী সর্ট করা
        leaderboard.sort(Comparator.comparingInt(ScoreEntry::getScore).reversed());

        System.out.println("Sorted Leaderboard (High to Low):");
        leaderboard.forEach(System.out::println);
        System.out.println();

        // ৮. ডিফল্ট হাই স্কোর (Supplier + Objects.requireNonNullElseGet)
        Supplier<ScoreEntry> defaultHighScore = () -> new ScoreEntry("Default Champion", 100);
        ScoreEntry missingEntry = null; // ধরো, ডাটা মিসিং
        ScoreEntry safeEntry = Objects.requireNonNullElseGet(missingEntry, defaultHighScore);

        System.out.println("Safe Default Entry: " + safeEntry);

        // ৯. অ্যান্ড্রয়েড রিয়েল-টাইম আপডেট সিমুলেশন (Timer)
        Random random = new Random();
        Timer timer = new Timer(3000, e -> {
            int newScore = random.nextInt(100) + 50;
            ScoreEntry newEntry = customEntry.apply("Random Raider", newScore);
            leaderboard.add(newEntry);
            System.out.println("\nReal-time Update: " + newEntry);
        });
        timer.start();

        // ১০. গেম বন্ধ করার জন্য (সিমুলেট)
        try { Thread.sleep(9000); } catch (InterruptedException ex) { /* ignore */ }
        timer.stop();
    }
}