package Dynamic_Game_Event_Management_System;

import java.time.LocalDateTime;

public class Event {
    // ইভেন্টের নাম সংরক্ষণের জন্য ভেরিয়েবল
    private String name;
    // ইভেন্ট শুরুর সময় সংরক্ষণের জন্য ভেরিয়েবল
    private LocalDateTime startTime;

    // ইভেন্ট তৈরির জন্য কনস্ট্রাক্টর
    public Event(String name, LocalDateTime startTime) {
        // নাম ইনিশিয়ালাইজ করা
        this.name = name;
        // শুরুর সময় ইনিশিয়ালাইজ করা
        this.startTime = startTime;
    }

    // ইভেন্টের নাম ফেরত দেয়
    public String getName() {
        return name;
    }

    // ইভেন্টের শুরুর সময় ফেরত দেয়
    public LocalDateTime getStartTime() {
        return startTime;
    }

    // ইভেন্টের বিবরণ স্ট্রিং হিসেবে ফেরত দেয়
    @Override
    public String toString() {
        // ইভেন্টের নাম এবং শুরুর সময় স্ট্রিং ফরম্যাটে ফেরত
        return "Event{name='" + name + "', startTime=" + startTime + "}";
    }
}