package Dynamic_Game_Event_Management_System;

public class Character implements Comparable<Character>, Cloneable {
    // চরিত্রের নাম সংরক্ষণের জন্য ভেরিয়েবল
    private String name;
    // চরিত্রের স্তর (লেভেল) সংরক্ষণের জন্য ভেরিয়েবল
    private int level;
    // চরিত্রের স্বাস্থ্য (হেলথ) সংরক্ষণের জন্য ভেরিয়েবল
    private int health;

    // চরিত্র তৈরির জন্য কনস্ট্রাক্টর
    public Character(String name, int level, int health) {
        // নাম ইনিশিয়ালাইজ করা
        this.name = name;
        // লেভেল ইনিশিয়ালাইজ করা
        this.level = level;
        // হেলথ ইনিশিয়ালাইজ করা
        this.health = health;
    }

    // চরিত্রের নাম ফেরত দেয়
    public String getName() {
        return name;
    }

    // চরিত্রের লেভেল ফেরত দেয়
    public int getLevel() {
        return level;
    }

    // চরিত্রের হেলথ ফেরত দেয়
    public int getHealth() {
        return health;
    }

    // চরিত্রের তুলনা করার জন্য মেথড (লেভেল অনুযায়ী)
    @Override
    public int compareTo(Character other) {
        // এই চরিত্রের লেভেলের সাথে অন্য চরিত্রের লেভেল তুলনা
        return Integer.compare(this.level, other.level);
    }

    // চরিত্রের ক্লোন তৈরির জন্য মেথড
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // শ্যালো কপি ফেরত দেয় (ফিল্ডগুলো ইমিউটেবল বা প্রিমিটিভ)
        return super.clone();
    }

    // চরিত্রের বিবরণ স্ট্রিং হিসেবে ফেরত দেয়
    @Override
    public String toString() {
        // চরিত্রের নাম, লেভেল, এবং হেলথ স্ট্রিং ফরম্যাটে ফেরত
        return "Character{name='" + name + "', level=" + level + ", health=" + health + "}";
    }
}