/* Package declaration */
package Hero_Factory_Simulator;

import java.util.*;
import java.util.stream.*;
import javax.swing.Timer;

/* থিয়রি: *Core Java* (p. 274) — Hero::new কনস্ট্রাক্টর রেফারেন্স স্ট্রিমে অবজেক্ট তৈরি করে, আর Hero[]::new টাইপড অ্যারে দেয়। */

public class HeroFactorySimulator {
    public static void main(String[] args) {
        // ১. নামের লিস্ট থেকে হিরো তৈরি (Constructor Reference: Hero::new)
        List<String> names = Arrays.asList(
                "Constructor Crusader",
                "Stream Sorcerer",
                "Lambda Legend",
                "Reference Ranger",
                "Power Paladin"
        );

        List<Hero> heroes = names.stream()
                .map(Hero::new) // Constructor reference: String -> Hero
                .sorted() // Sort by powerLevel
                .toList();

        System.out.println("Generated Heroes from Names:");
        heroes.forEach(System.out::println);
        System.out.println();

        // ২. পাওয়ার লেভেল থেকে হিরো তৈরি (আরেকটা কনস্ট্রাক্টর রেফারেন্স)
        List<Integer> powerLevels = Arrays.asList(50, 80, 120, 90, 110);

        Hero[] heroArray = powerLevels.stream()
                .map(Hero::new) // Constructor reference: int -> Hero
                .toArray(Hero[]::new); // Typed array creation

        System.out.println("Hero Array from Power Levels:");
        Arrays.stream(heroArray).forEach(System.out::println);
        System.out.println();

        // ৩. র‍্যান্ডম স্ট্রিং থেকে হিরো স্পন (অ্যান্ড্রয়েড স্পনিং সিমুলেশন)
        Random random = new Random();
        List<String> randomNames = Stream.generate(() -> "Random Hero " + random.nextInt(100))
                .limit(3)
                .toList();

        List<Hero> randomHeroes = randomNames.stream()
                .map(Hero::new)
                .toList();

        System.out.println("Random Spawned Heroes:");
        randomHeroes.forEach(System.out::println);
        System.out.println();

        // ৪. টাইমার দিয়ে সিমুলেটেড স্পন (অ্যান্ড্রয়েড গেম লুপ)
        Timer spawnTimer = new Timer(2000, e -> {
            String spawnName = "Spawned Hero " + random.nextInt(50);
            Hero spawned = new Hero(spawnName); // Constructor call
            System.out.println("New Spawn: " + spawned);
        });
        spawnTimer.start();

        // ৫. স্পন স্টপ (সিমুলেটেড)
        try { Thread.sleep(6000); } catch (InterruptedException ex) { /* ignore */ }
        spawnTimer.stop();
        System.out.println("Spawning paused!");
    }
}