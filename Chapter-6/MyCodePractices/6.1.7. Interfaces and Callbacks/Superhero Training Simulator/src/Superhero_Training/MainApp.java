package Superhero_Training;

import javax.swing.*;

/*
 MainApp হলো entry point.
 এখানে আমরা Timer সেট করব যাতে প্রতি ১.৫ সেকেন্ডে HeroTrainer কে কল করে।
*/
public class MainApp {
    public static void main(String[] args) {
        HeroTrainer trainer = new HeroTrainer();

        // Timer তৈরি: প্রতি 1500ms (১.৫ সেকেন্ডে) actionPerformed() কল হবে
        Timer timer = new Timer(1500, trainer);
        timer.start();

        // User কে option দেওয়া হবে training বন্ধ করার জন্য
        int result = JOptionPane.showConfirmDialog(
                null,
                "End superhero training?",
                "Training Control",
                JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            timer.stop();
            System.out.println("🚨 Training stopped by user.");
        } else {
            System.out.println("🔥 Superhero keeps training endlessly!");
        }

        // Program শেষ হবে না সাথে সাথে, কারণ JOptionPane modal dialog
    }
}

