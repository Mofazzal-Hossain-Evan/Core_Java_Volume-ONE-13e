package PersonalizedFitnessTracker;

public class WorkoutPlan {
    protected double duration;

    public WorkoutPlan(double duration) {
        this.duration = duration;
    }

    public double calculateCaloriesBurned(){
        return duration * 5;
    }
}

