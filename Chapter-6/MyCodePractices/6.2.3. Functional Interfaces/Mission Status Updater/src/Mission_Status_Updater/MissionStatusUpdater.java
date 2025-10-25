/* Package declaration to match directory structure */
package Mission_Status_Updater;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/* থিয়রি: *Core Java* (Volume I, 13th Edition, Chapter 6) বলে, ল্যামডা ফাঙ্কশনাল ইন্টারফেসে কোড ব্লক দেয়, যা টাইম্ড ইভেন্টে দরকারি (Horstmann, p. 274). *Effective Java* (Item 42) বলে, ল্যামডা ডিফার্ড এক্সিকিউশন সহজ করে (Bloch, p. 200). */

/* Main class for mission status updater with lambda-based timers */
public class MissionStatusUpdater {
    public static void main(String[] args) {
        /* Initialize missions with fun names */
        Mission[] missions = {
                new Mission("Quest for the Holy Algorithm", 0, "In Progress"),
                new Mission("Hunt for the Lost Bug", 0, "In Progress"),
                new Mission("Decode the Cosmic Cipher", 0, "In Progress")
        };

        Random random = new Random();

        /* First lambda-based ActionListener: Update mission progress every 1.5 seconds */
        Timer updateTimer = new Timer(1500, event -> {
            boolean allCompleted = true;
            for (Mission mission : missions) {
                if (mission.getProgress() < 100) {
                    int increment = random.nextInt(10) + 1; // Random increment 1-10
                    mission.setProgress(Math.min(100, mission.getProgress() + increment));
                    if (mission.getProgress() == 100) {
                        mission.setStatus("Completed");
                    }
                    System.out.println("Updated: " + mission);
                    allCompleted = false;
                }
            }
            if (allCompleted) {
                System.out.println("All missions completed!");
            }
        });
        updateTimer.start();

        /* Second lambda-based ActionListener: Handle pause event after 10 seconds (simulating pause) */
        Timer pauseTimer = new Timer(10000, event -> {
            updateTimer.stop();
            System.out.println("Missions paused! Current status:");
            for (Mission mission : missions) {
                System.out.println(mission);
            }
        });
        pauseTimer.setRepeats(false); // Run only once
        pauseTimer.start();

        /* Use JOptionPane to quit */
        int option = JOptionPane.showConfirmDialog(null, "Abort missions?", "Mission Control", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            updateTimer.stop();
            pauseTimer.stop();
            System.out.println("Missions aborted!");
        } else {
            System.out.println("Continuing missions...");
            // Timers may have already stopped or paused; in real app, restart if needed
        }
    }
}