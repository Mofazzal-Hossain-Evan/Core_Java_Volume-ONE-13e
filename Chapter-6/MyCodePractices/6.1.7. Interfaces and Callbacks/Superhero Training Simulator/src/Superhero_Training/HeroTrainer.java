package Superhero_Training;

import javax.swing.*;
import java.awt.*;   // Toolkit এর জন্য
import java.awt.event.*;  // ActionListener এর জন্য
import java.util.*;  // Random & List এর জন্য
import java.util.List;

/*
 থিওরি:
 HeroTrainer ক্লাস হলো ActionListener এর ইমপ্লিমেন্টেশন।
 অর্থাৎ Timer যখনই tick করবে, actionPerformed() callback হিসেবে কল হবে।
 এখানেই আমরা superhero এর action প্রিন্ট করব।
*/
public class HeroTrainer implements ActionListener {

    private List<String> feats;   // সুপারহিরোর সব কীর্তির লিস্ট
    private Random rand;          // র‍্যান্ডম নাম্বার জেনারেটর
    private int counter = 0;      // কয়টা action হয়েছে সেটা ট্র্যাক করার জন্য

    // Constructor: feats লিস্ট initialize করা হচ্ছে
    public HeroTrainer() {
        feats = new ArrayList<>();
        feats.add("Superhero lifts a bus!");
        feats.add("Superhero saves a cat!");
        feats.add("Superhero stops a speeding train!");
        feats.add("Superhero catches a meteor!");
        feats.add("Superhero rescues people from a fire!");

        rand = new Random();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // র‍্যান্ডম একটি feat বেছে নেওয়া হচ্ছে
        String feat = feats.get(rand.nextInt(feats.size()));

        // Training time log করা হচ্ছে
        long time = e.getWhen();

        // Output
        System.out.println("[" + counter + "] " + feat + " (time: " + time + ")");

        // মজা করার জন্য মাঝে মাঝে beep দেওয়া হচ্ছে
        if (rand.nextBoolean()) {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("💪 Go, Superhero, go!");
        }

        counter++;
    }
}
