package AiPoweredFitnessCoach;

public class AICoach extends Coach{

    @Override
    void suggestWorkout(){
        System.out.println("AI-Based Workout: Adaptive session based on previous data.");
        analyzeUserData();
    }

    void analyzeUserData(){
        System.out.println("Analyzing user's previous workouts...");
        System.out.println("Suggested AI Workout: 35 minutes strength training.");
    }
}
