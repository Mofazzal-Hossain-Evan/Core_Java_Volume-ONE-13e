package AiFitnessCoach;

public class Coach {
    void suggestWorkout(){
        System.out.println("Basic workout: 30 min jogging.");
    }

    void suggestWorkout(int duration){
        System.out.println("Workout for " + duration + " minutes: Mix of cardio and strength training.");
    }

    void suggestWorkout(String intensity){
        System.out.println("Workout with " + intensity + " intensity: Adjust exercises accordingly.");
    }
}
