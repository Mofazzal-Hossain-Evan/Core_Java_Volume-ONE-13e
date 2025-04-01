package AiFitnessCoach;

public class AICoach extends Coach{

    void analyzeUserData() {
        System.out.println("Analyzing user data... Adjusting workout accordingly.");
    }

    @Override
    void suggestWorkout() {
        analyzeUserData();
        System.out.println("AI-powered workout: Custom plan based on user progress!");
    }


}
