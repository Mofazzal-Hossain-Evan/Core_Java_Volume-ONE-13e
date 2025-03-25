package PersonalizedFitnessTracker;

public class YogaPlan extends WorkoutPlan{
    public YogaPlan(double duration) {
        super(duration);
    }
    
    @Override
    public double calculateCaloriesBurned(){
        return super.calculateCaloriesBurned() + (duration * 1.5);
    }

}


