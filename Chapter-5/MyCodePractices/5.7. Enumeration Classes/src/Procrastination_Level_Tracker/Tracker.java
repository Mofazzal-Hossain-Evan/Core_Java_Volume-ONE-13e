package Procrastination_Level_Tracker;

import java.util.Scanner;

public class Tracker {

    static void suggestAction(ProcrastinationLevelTracker level){
        switch (level){
            case LOW -> System.out.println("Keep it up!");
            case MEDIUM -> System.out.println("Maybe take a 5 min break, then continue.");
            case HIGH -> System.out.println("Get back to work after this episode!");
            case CRITICAL -> System.out.println("Please. Save yourself. Start working!");
        }
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your procrastination level (LOW, MEDIUM, HIGH, CRITICAL): ");
        String input = scanner.nextLine().toUpperCase();

        ProcrastinationLevelTracker level = ProcrastinationLevelTracker.valueOf(ProcrastinationLevelTracker.class, input);
        System.out.println("You are currently: " +level.getDescription());
        suggestAction(level);
    }
}
