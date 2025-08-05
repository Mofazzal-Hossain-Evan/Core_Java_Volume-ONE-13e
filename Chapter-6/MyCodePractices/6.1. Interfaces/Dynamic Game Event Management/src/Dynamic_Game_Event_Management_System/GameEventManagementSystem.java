package Dynamic_Game_Event_Management_System;

import java.time.LocalDateTime;
import java.util.Scanner;

public class GameEventManagementSystem {
    // প্রোগ্রামের মূল মেথড
    public static void main(String[] args) {
        // ইভেন্ট ম্যানেজার অবজেক্ট তৈরি
        EventManager manager = new EventManager();
        // ইনপুট নেয়ার জন্য স্ক্যানার
        Scanner scanner = new Scanner(System.in);

        // নমুনা ডেটা যোগ করা
        manager.addCharacter(new Character("Warrior", 10, 100));
        // আরেকটি নমুনা চরিত্র যোগ করা
        manager.addCharacter(new Character("Mage", 8, 80));
        // নমুনা ইভেন্ট যোগ করা (৫ মিনিট পর শুরু হবে)
        manager.addEvent(new Event("Battle", LocalDateTime.of(2025, 6, 11, 21, 58)));
        // ইভেন্ট লিসেনার যোগ করা (কনসোল নোটিফিকেশন)
        manager.addEventListener(event -> System.out.println("কনসোল নোটিফিকেশন: " + event));

        // মেনু লুপ
        while (true) {
            // মেনু প্রিন্ট করা
            System.out.println("\nগেম ইভেন্ট ম্যানেজমেন্ট সিস্টেম");
            System.out.println("১. চরিত্র দেখুন");
            System.out.println("২. নাম অনুযায়ী চরিত্র সাজান");
            System.out.println("৩. হেলথ অনুযায়ী চরিত্র সাজান");
            System.out.println("৪. লেভেল এবং হেলথ অনুযায়ী চরিত্র সাজান");
            System.out.println("৫. চরিত্র ক্লোন করুন");
            System.out.println("৬. ইভেন্ট দেখুন");
            System.out.println("৭. প্রস্থান");
            System.out.print("একটি অপশন বেছে নিন: ");

            // ইউজারের ইনপুট নেয়া
            int choice = scanner.nextInt();
            // নিউলাইন গ্রাস করা
            scanner.nextLine();

            // ইউজারের পছন্দ অনুযায়ী কাজ
            switch (choice) {
                case 1:
                    // চরিত্রের তালিকা প্রিন্ট করা
                    System.out.println("চরিত্র: " + manager.getCharacters());
                    break;
                case 2:
                    // নাম অনুযায়ী সর্ট করা
                    manager.sortCharactersByName();
                    // সর্ট করা তালিকা প্রিন্ট
                    System.out.println("নাম অনুযায়ী সাজানো: " + manager.getCharacters());
                    break;
                case 3:
                    // হেলথ অনুযায়ী সর্ট করা
                    manager.sortCharactersByHealth();
                    // সর্ট করা তালিকা প্রিন্ট
                    System.out.println("হেলথ অনুযায়ী সাজানো: " + manager.getCharacters());
                    break;
                case 4:
                    // লেভেল এবং হেলথ অনুযায়ী সর্ট করা
                    manager.sortCharactersByLevelAndHealth();
                    // সর্ট করা তালিকা প্রিন্ট
                    System.out.println("লেভেল এবং হেলথ অনুযায়ী সাজানো: " + manager.getCharacters());
                    break;
                case 5:
                    // চরিত্র ক্লোন করার চেষ্টা
                    if (!manager.getCharacters().isEmpty()) {
                        try {
                            // প্রথম চরিত্র ক্লোন করা
                            Character cloned = manager.cloneCharacter(manager.getCharacters().get(0));
                            // ক্লোন করা চরিত্র প্রিন্ট
                            System.out.println("ক্লোন করা চরিত্র: " + cloned);
                        } catch (CloneNotSupportedException e) {
                            // ক্লোনিং ব্যর্থ হলে ত্রুটি প্রিন্ট
                            System.out.println("ক্লোনিং ব্যর্থ: " + e.getMessage());
                        }
                    } else {
                        // কোনো চরিত্র না থাকলে মেসেজ
                        System.out.println("ক্লোন করার জন্য কোনো চরিত্র নেই।");
                    }
                    break;
                case 6:
                    // ইভেন্টের তালিকা প্রিন্ট
                    System.out.println("ইভেন্ট: " + manager.getEvents());
                    break;
                case 7:
                    // প্রস্থান মেসেজ প্রিন্ট
                    System.out.println("প্রস্থান করা হচ্ছে...");
                    // স্ক্যানার বন্ধ
                    scanner.close();
                    // প্রোগ্রাম শেষ
                    System.exit(0);
                default:
                    // ভুল অপশনের জন্য মেসেজ
                    System.out.println("অবৈধ অপশন। আবার চেষ্টা করুন।");
            }
        }
    }
}