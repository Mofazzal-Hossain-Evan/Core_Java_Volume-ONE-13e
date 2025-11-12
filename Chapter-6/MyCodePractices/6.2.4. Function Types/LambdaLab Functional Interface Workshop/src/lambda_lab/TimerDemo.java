package lambda_lab;

import javax.swing.*;  // Timer এর জন্য
import java.awt.*;     // Toolkit.getDefaultToolkit().beep() এর জন্য
import java.time.Instant; // সময় প্রদর্শনের জন্য

// 🔹 Functional interface demonstration with ActionListener (Timer example)
public class TimerDemo {

    public static void runDemo() {
        // 🔸 Timer constructor expects an ActionListener (functional interface)
        // ActionListener interface এ মাত্র একটিই abstract method আছে: actionPerformed(ActionEvent e)
        var timer = new Timer(1000, event -> {
            // 🔸 প্রতি ১ সেকেন্ড পর এই কোডটি চলবে
            System.out.println("🕐 Time: " + Instant.ofEpochMilli(event.getWhen()));

            // 🔸 সাউন্ড বাজানো (optional)
            Toolkit.getDefaultToolkit().beep();
        });

        // 🔸 Timer শুরু করা
        timer.start();

        // 🔸 এখন মূল থ্রেড ৩ সেকেন্ড ঘুমাবে যাতে Timer ইভেন্ট চলতে পারে
        try {
            Thread.sleep(3100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 🔸 Timer বন্ধ করা
        timer.stop();

        // 🔹 ব্যাখ্যা:
        // Timer একটি functional interface (ActionListener) কে ল্যাম্বডা আকারে নিচ্ছে।
        // ইভেন্ট ঘটলে ল্যাম্বডার ভেতরের কোডটি চলে।
    }
}
