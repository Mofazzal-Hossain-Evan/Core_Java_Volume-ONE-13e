package TV_BingeMode;

import java.util.Scanner;

public class BingeSessionManager {


    public static void startSession(BingeMode mode){
        System.out.println("🎬 Binge Mode Selected: " + mode );
        System.out.println("👉 Description: " +mode.getDescription());
        System.out.println("⏱️ Estimated Time: " + mode.getEstimatedTime());
        System.out.println("💬 Message: " + mode.getMessage());

        // Challenge: Give suggestion based on time
        if (mode.ordinal() >= BingeMode.HARDCORE.ordinal()){
            System.out.println("⚠️ Warning: Don’t forget to hydrate and stretch!");
        }
        System.out.println("✅ Session started!\n");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("📺 Enter Binge Mode (CASUAL, MODERATE, HARDCORE, ZOMBIE): ");
        String input = scanner.nextLine().toUpperCase();

        try{
            BingeMode selectedMode = BingeMode.valueOf(BingeMode.class, input);
            startSession(selectedMode);
        } catch (IllegalArgumentException e){
            System.out.println("❌ Invalid mode. Please enter a valid Binge Mode.");
        }
    }
}
