package events;

import core.Event;

public class Quest extends Event {
    public Quest(String title, java.time.LocalDateTime dateTime, core.Character participant) {
        super(title, dateTime, participant);
    }

    // ব্যাখ্যা: sendReminder কোয়েস্টের রিমাইন্ড পাঠায়।
    public void sendReminder() {
        System.out.println("Reminder: " + getParticipant().getName() + " has a quest!");
    }

    // Getter
    public core.Character getParticipant() { return super.participant; }
}