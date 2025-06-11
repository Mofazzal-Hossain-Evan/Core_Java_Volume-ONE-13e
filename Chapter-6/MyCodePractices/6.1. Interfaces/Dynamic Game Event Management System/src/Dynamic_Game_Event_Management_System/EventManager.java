package Dynamic_Game_Event_Management_System;

import javax.swing.*;
import java.time.ZoneOffset;
import java.util.*;
import java.util.Timer;

public class EventManager {
    // চরিত্রের তালিকা সংরক্ষণের জন্য লিস্ট
    private List<Character> characters = new ArrayList<>();
    // ইভেন্টের তালিকা সংরক্ষণের জন্য লিস্ট
    private List<Event> events = new ArrayList<>();
    // ইভেন্ট লিসেনারের তালিকা সংরক্ষণের জন্য লিস্ট
    private List<EventListener> listeners = new ArrayList<>();

    // ইভেন্ট পরিচালনার জন্য ইনার ক্লাস
    private class EventHandler {
        // টাইমারের জন্য ভেরিয়েবল
        private Timer timer;

        // ইভেন্ট হ্যান্ডলারের কনস্ট্রাক্টর
        public EventHandler(Event event) {
            // ইভেন্ট শুরুর সময় এবং বর্তমান সময়ের পার্থক্য হিসাব
            long delay = event.getStartTime().toInstant(ZoneOffset.ofHours(6))
                    .toEpochMilli() - System.currentTimeMillis();
            // যদি ডিলে নেগেটিভ হয়, তবে ০ সেট করা
            if (delay < 0) delay = 0;

            // টাইমার তৈরি এবং ইভেন্ট শুরুর সময় নোটিফিকেশন
            timer = new Timer((int) delay, e -> {
                // সব লিসেনারকে ইভেন্ট শুরুর নোটিফিকেশন পাঠানো
                listeners.forEach(listener -> listener.onEventStart(event));
                // GUI ডায়ালগে ইভেন্ট শুরুর নোটিফিকেশন দেখানো
                JOptionPane.showMessageDialog(null, "ইভেন্ট শুরু: " + event.getName(),
                        "ইভেন্ট নোটিফিকেশন", JOptionPane.INFORMATION_MESSAGE);
            });
            // টাইমার একবারই চলবে
            timer.setRepeats(false);
            // টাইমার শুরু করা
            timer.start();
        }
    }

    // চরিত্র যোগ করার মেথড
    public void addCharacter(Character character) {
        // চরিত্র লিস্টে যোগ করা
        characters.add(character);
    }

    // ইভেন্ট যোগ করার মেথড
    public void addEvent(Event event) {
        // ইভেন্ট লিস্টে যোগ করা
        events.add(event);
        // নতুন ইভেন্ট হ্যান্ডলার তৈরি
        new EventHandler(event);
    }

    // ইভেন্ট লিসেনার যোগ করার মেথড
    public void addEventListener(EventListener listener) {
        // লিসেনার লিস্টে যোগ করা
        listeners.add(listener);
    }

    // নাম অনুযায়ী চরিত্র সাজানো
    public void sortCharactersByName() {
        // ল্যাম্বডা ব্যবহার করে নাম অনুযায়ী সর্ট
        characters.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    // হেলথ অনুযায়ী চরিত্র সাজানো
    public void sortCharactersByHealth() {
        // ল্যাম্বডা ব্যবহার করে হেলথ অনুযায়ী সর্ট
        characters.sort((c1, c2) -> Integer.compare(c1.getHealth(), c2.getHealth()));
    }

    // লেভেল এবং হেলথ অনুযায়ী চরিত্র সাজানো
    public void sortCharactersByLevelAndHealth() {
        // ল্যাম্বডা ব্যবহার করে লেভেল এবং হেলথ অনুযায়ী সর্ট
        characters.sort((c1, c2) -> {
            // প্রথমে লেভেল তুলনা
            int levelCompare = Integer.compare(c1.getLevel(), c2.getLevel());
            // লেভেল সমান হলে হেলথ তুলনা
            return levelCompare != 0 ? levelCompare : Integer.compare(c1.getHealth(), c2.getHealth());
        });
    }

    // চরিত্র ক্লোন করার মেথড
    public Character cloneCharacter(Character character) throws CloneNotSupportedException {
        // চরিত্রের ক্লোন ফেরত দেয়
        return (Character) character.clone();
    }

    // চরিত্রের তালিকা ফেরত দেয়
    public List<Character> getCharacters() {
        return characters;
    }

    // ইভেন্টের তালিকা ফেরত দেয়
    public List<Event> getEvents() {
        return events;
    }
}