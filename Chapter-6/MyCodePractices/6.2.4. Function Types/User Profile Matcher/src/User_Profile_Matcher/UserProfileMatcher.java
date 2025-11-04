/* Package declaration */
package User_Profile_Matcher;

import java.util.*;
import java.util.function.*;

/* থিয়রি: *Core Java* (p. 274) — BiFunction অবজেক্ট ক্রিয়েশনের জন্য, ToIntFunction এক্সট্র্যাকশনের জন্য। */

public class UserProfileMatcher {
    public static void main(String[] args) {
        // ১. প্রোফাইল ক্রিয়েটর (BiFunction)
        BiFunction<String, Integer, UserProfile> profileCreator =
                (name, level) -> new UserProfile(name, level);

        // ২. লেভেল এক্সট্র্যাক্টর (ToIntFunction)
        ToIntFunction<UserProfile> levelExtractor =
                profile -> profile.getActivityLevel();

        // ৩. লেজি প্রোফাইল জেনারেটর (IntFunction)
        IntFunction<UserProfile> profileGenerator =
                i -> new UserProfile("User " + i, i * 5);

        // ৪. প্রোফাইল অ্যারে তৈরি (লেজি)
        int numProfiles = 5;
        UserProfile[] profiles = new UserProfile[numProfiles];
        for (int i = 0; i < numProfiles; i++) {
            profiles[i] = profileGenerator.apply(i);
        }

        // ৫. লিস্টে কনভার্ট এবং মজার প্রোফাইল যোগ করা
        List<UserProfile> profileList = new ArrayList<>(Arrays.asList(profiles));
        profileList.add(profileCreator.apply("Lazy Lambda Lounger", 2));
        profileList.add(profileCreator.apply("Quantum Questsman", 8));
        profileList.add(profileCreator.apply("Code Cosmic", 6));

        System.out.println("Initial Profiles:");
        profileList.forEach(System.out::println);
        System.out.println();

        // ৬. ইন্যাকটিভ প্রোফাইল ফেলে দেওয়া (Predicate + removeIf)
        Predicate<UserProfile> inactive = profile -> profile.getActivityLevel() < 5;
        profileList.removeIf(inactive);

        System.out.println("After removing inactive profiles (level < 5):");
        profileList.forEach(System.out::println);
        System.out.println();

        // ৭. টোটাল অ্যাকটিভিটি ক্যালকুলেট (ToIntFunction + stream)
        int totalActivity = profileList.stream()
                .mapToInt(levelExtractor)
                .sum();

        System.out.println("Total Activity Levels: " + totalActivity);
        System.out.println();

        // ৮. ডিফল্ট প্রোফাইল (Supplier + Objects.requireNonNullElseGet)
        Supplier<UserProfile> defaultProfile = () -> new UserProfile("Default User", 1);
        UserProfile missingProfile = null; // ধরো, ডাটা মিসিং
        UserProfile safeProfile = Objects.requireNonNullElseGet(missingProfile, defaultProfile);

        System.out.println("Safe Default Profile: " + safeProfile);
        System.out.println();

        // ৯. অ্যান্ড্রয়েড রিয়েল-টাইম আপডেট সিমুলেশন (Optional, but fun)
        System.out.println("Simulating real-time profile matching...");
        for (UserProfile p : profileList) {
            System.out.println("Matched: " + p);
            try { Thread.sleep(500); } catch (InterruptedException e) { /* ignore */ }
        }
        System.out.println("Matching complete!");
    }
}