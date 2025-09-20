package cloning_project1;

import java.util.ArrayList;
import java.util.List;

public class ShallowCloneDemo {
    public static void main(String[] args) {
        // মূল chapters লিস্ট তৈরি
        List<String> chapters = new ArrayList<>();
        chapters.add("Introduction");
        chapters.add("Basics of Java");

        // মূল বই তৈরি
        Book originalBook = new Book("Java Fundamentals", "John Doe", chapters);

        // Shallow clone করা হলো
        Book clonedBook = originalBook.clone();

        // ক্লোনে নতুন chapter যোগ করা হলো
        clonedBook.addChapter("Advanced Topics");

        // প্রিন্ট করা হলো মূল এবং ক্লোন
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book:   " + clonedBook);

        // লক্ষ্য করুন: chapters লিস্ট shared, তাই original-এও change হয়েছে
    }
}
