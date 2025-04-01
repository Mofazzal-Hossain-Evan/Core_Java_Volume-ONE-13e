package AiPoweredFitnessCoach;

public class Coach {

    void suggestWorkout(){
        System.out.println("Basic Workout: 30 minutes jogging.");
    }

    void suggestWorkout(int duration){
        System.out.println("Suggested Workout: " + duration + " minutes cardio.");
    }

    void suggestWorkout(String intensity){
        if (intensity.equalsIgnoreCase("High")){
            System.out.println("Its high");
        } else if (intensity.equalsIgnoreCase("low")) {
            System.out.println("Its Low");
        } else {
            System.out.println("Its Medium");
        }
    }
}


