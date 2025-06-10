package core;

import calculators.ScientificCalculator;
import characters.Mage;
import characters.Warrior;
import events.Battle;
import events.Quest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Character> characters = new ArrayList<>();
    private static List<Event> events = new ArrayList<>();
    private static List<Plugin> plugins = new ArrayList<>();
    private static Calculator calculator = new ScientificCalculator();

    public static void main(String[] args) {
        loadResources();
        displayMenu();
    }

    // ব্যাখ্যা: loadResources রিসোর্স ফাইল থেকে ডেটা লোড করে।
    private static void loadResources() {
        loadCharacters();
        loadEvents();
        loadPlugins();
    }

    // ব্যাখ্যা: loadCharacters characters.txt থেকে চরিত্র লোড করে।
    private static void loadCharacters() {
        try (InputStream is = Main.class.getResourceAsStream("/characters.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals("Warrior")) {
                    characters.add(new Warrior(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
                } else if (parts[0].equals("Mage")) {
                    characters.add(new Mage(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading characters: " + e.getMessage());
        }
    }

    // ব্যাখ্যা: loadEvents events.txt থেকে ইভেন্ট লোড করে।
    private static void loadEvents() {
        try (InputStream is = Main.class.getResourceAsStream("/events.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                LocalDateTime dateTime = LocalDateTime.parse(parts[2]);
                Character participant = findCharacter(parts[3]);
                if (parts[0].equals("Battle")) {
                    events.add(new Battle(parts[1], dateTime, participant));
                } else if (parts[0].equals("Quest")) {
                    events.add(new Quest(parts[1], dateTime, participant));
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading events: " + e.getMessage());
        }
    }

    // ব্যাখ্যা: loadPlugins plugins.txt থেকে প্লাগিন লোড করে।
    private static void loadPlugins() {
        try (InputStream is = Main.class.getResourceAsStream("/plugins.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Class<?> pluginClass = Class.forName(line.trim());
                Constructor<?> constructor = pluginClass.getConstructor();
                plugins.add((Plugin) constructor.newInstance());
            }
        } catch (Exception e) {
            System.out.println("Error loading plugins: " + e.getMessage());
        }
    }

    // ব্যাখ্যা: findCharacter নাম দিয়ে চরিত্র খুঁজে পায়।
    private static Character findCharacter(String name) {
        return characters.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
    }

    // ব্যাখ্যা: displayMenu ব্যবহারকারী ইন্টারফেস প্রদর্শন করে।
    private static void displayMenu() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("স্বাগতম Dynamic Gaming Event System-এ!");
        System.out.println("বর্তমান সময়: " + currentTime);

        while (true) {
            System.out.println("\nমেনু:");
            System.out.println("1. চরিত্রগুলো দেখুন");
            System.out.println("2. নতুন ইভেন্ট সেট করুন");
            System.out.println("3. ইভেন্ট শুরু করুন");
            System.out.println("4. প্লাগিন লোড করুন");
            System.out.println("5. লগ/স্ট্যাটিস্টিক দেখুন");
            System.out.println("6. বাহির হন");
            System.out.print("পছন্দ করুন: ");

            try {
                int choice = Integer.parseInt(System.console().readLine());
                switch (choice) {
                    case 1: listCharacters(); break;
                    case 2: scheduleEvent(); break;
                    case 3: startEvent(); break;
                    case 4: loadPlugin(); break;
                    case 5: displayLogsStats(); break;
                    case 6: System.out.println("বাহির হচ্ছি..."); return;
                    default: System.out.println("অবৈধ পছন্দ!");
                }
            } catch (Exception e) {
                System.out.println("ত্রুটি: " + e.getMessage());
            }
        }
    }

    // ব্যাখ্যা: listCharacters চরিত্রগুলো প্রদর্শন করে।
    private static void listCharacters() {
        System.out.println("চরিত্রগুলো:");
        characters.forEach(Character::displayStats);
    }

    // ব্যাখ্যা: scheduleEvent নতুন ইভেন্ট সেট করে।
    private static void scheduleEvent() {
        System.out.print("ইভেন্টের নাম: ");
        String title = System.console().readLine();
        System.out.print("তারিখ (yyyy-MM-ddTHH:mm:ss): ");
        String dateTimeStr = System.console().readLine();
        System.out.print("অংশগ্রহণকারী (নাম): ");
        String participantName = System.console().readLine();
        Character participant = findCharacter(participantName);
        if (participant != null) {
            try {
                LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);
                events.add(new Battle(title, dateTime, participant)); // সরলতার জন্য Battle ব্যবহার
                System.out.println("ইভেন্ট সেট করা হয়েছে!");
            } catch (Exception e) {
                System.out.println("তারিখ বা ফরম্যাট ত্রুটি: " + e.getMessage());
            }
        } else {
            System.out.println("চরিত্র পাওয়া যায়নি!");
        }
    }

    // ব্যাখ্যা: startEvent ইভেন্ট শুরু করে এবং গণনা করে।
    private static void startEvent() {
        LocalDateTime currentTime = LocalDateTime.now();
        for (Event event : events) {
            if (event.getDateTime().isAfter(currentTime) || event.getDateTime().isEqual(currentTime)) {
                System.out.println("ইভেন্ট শুরু: " + event.getDateTime());
                try {
                    event.performAction("startBattle"); // সরলতার জন্য startBattle
                    calculator.executeOperation("sqrt", event.getDateTime().getHour()); // উদাহরণ গণনা
                    calculator.displayResult();
                    for (Plugin plugin : plugins) {
                        plugin.execute("logEvent", "Event started: " + event.getDateTime());
                    }
                } catch (Exception e) {
                    System.out.println("ইভেন্ট ত্রুটি: " + e.getMessage());
                }
            }
        }
    }

    // ব্যাখ্যা: loadPlugin নতুন প্লাগিন লোড করে।
    private static void loadPlugin() {
        System.out.print("প্লাগিন ক্লাস নাম (যেমন: plugins.LogPlugin): ");
        String pluginClassName = System.console().readLine();
        try {
            Class<?> pluginClass = Class.forName(pluginClassName);
            Constructor<?> constructor = pluginClass.getConstructor();
            plugins.add((Plugin) constructor.newInstance());
            System.out.println("প্লাগিন লোড করা হয়েছে!");
        } catch (Exception e) {
            System.out.println("প্লাগিন লোড ত্রুটি: " + e.getMessage());
        }
    }

    // ব্যাখ্যা: displayLogsStats লগ এবং স্ট্যাটিস্টিক প্রদর্শন করে।
    private static void displayLogsStats() {
        for (Plugin plugin : plugins) {
            try {
                plugin.execute("displayLogs"); // LogPlugin-এর জন্য
                plugin.execute("displayStats", characters.get(0)); // StatsPlugin-এর জন্য
            } catch (Exception e) {
                System.out.println("লগ/স্ট্যাটিস্টিক ত্রুটি: " + e.getMessage());
            }
        }
    }
}