package Alien_Invasion_Alert_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

/* এই ক্লাস হল আসল এলিয়েন অ্যালার্টার */
public class InvasionAlerter implements ActionListener {
    private List<String> messages; // মজার এলিয়েন মেসেজের লিস্ট
    private Random random = new Random(); // এলোমেলোভাবে মেসেজ বাছাই করার জন্য
    private int alertCount = 0; // কতবার অ্যালার্ট এসেছে

    // Constructor
    public InvasionAlerter(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (messages.isEmpty()) return;

        // এলোমেলো মেসেজ বাছাই
        String alert = messages.get(random.nextInt(messages.size()));

        // অ্যালার্ট প্রিন্ট
        System.out.println("ALERT #" + (++alertCount) + ": " + alert);

        // কখন অ্যালার্ট এসেছে তা দেখাবে
        System.out.println("Time: " + e.getWhen());

        // Sci-fi রাডার পিং
        Toolkit.getDefaultToolkit().beep();

        // ছোট মজার encouragement
        System.out.println("Keep calm and fight the aliens!\n");
    }
}
