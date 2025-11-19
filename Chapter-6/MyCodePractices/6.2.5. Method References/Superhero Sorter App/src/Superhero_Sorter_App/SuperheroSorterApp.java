/* Package declaration */
package Superhero_Sorter_App;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import javax.swing.Timer;

/* থিয়রি: *Core Java* (p. 274) — Class::instanceMethod সর্টিং-এ, object::instanceMethod প্রিন্টিং-এ। */

public class SuperheroSorterApp {
    public static void main(String[] args) {
        // ১. হিরো অ্যারে তৈরি (মজার নাম)
        Superhero[] heroes = {
                new Superhero("Method Man", 80),
                new Superhero("Reference Ranger", 65),
                new Superhero("Lambda Legend", 90),
                new Superhero("Static Sorcerer", 75),
                new Superhero("Comparator Captain", 85)
        };

        // ২. পাওয়ার লেভেল সর্টার (মেথড রেফারেন্স)
        Comparator<Superhero> byPower = Comparator.comparingInt(Superhero::getPowerLevel);
        Arrays.sort(heroes, byPower.reversed()); // ডিসেন্ডিং

        System.out.println("Ranked by Power Level (High to Low):");
        Arrays.stream(heroes).forEach(System.out::println);
        System.out.println();

        // ৩. নাম সর্টার (মেথড রেফারেন্স)
        Comparator<Superhero> byName = Comparator.comparing(Superhero::getName, String::compareToIgnoreCase);
        Arrays.sort(heroes, byName);

        System.out.println("Ranked by Name (Ignore Case):");
        Arrays.stream(heroes).forEach(System.out::println);
        System.out.println();

        // ৪. অ্যান্ড্রয়েড লিডারবোর্ড রিফ্রেশ (টাইমার + রেফারেন্স)
        Random random = new Random();
        Timer timer = new Timer(2000, e -> {
            // র্যান্ডম পাওয়ার আপডেট
            int index = random.nextInt(heroes.length);
            heroes[index].setPowerLevel(heroes[index].getPowerLevel() + random.nextInt(10)); // বুস্ট
            Arrays.sort(heroes, byPower.reversed());
            System.out.println("Leaderboard Refresh (Power High to Low):");
            Arrays.stream(heroes).forEach(System.out::println);
            System.out.println("-----");
        });
        timer.start();

        // ৫. গেম বন্ধ করার জন্য (সিমুলেট)
        try { Thread.sleep(6000); } catch (InterruptedException ex) { /* ignore */ }
        timer.stop();
        System.out.println("Leaderboard Update Stopped!");
    }
}