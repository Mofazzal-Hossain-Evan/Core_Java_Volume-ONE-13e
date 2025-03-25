package PersonalizedFitnessTracker;

class StrengthTrainingPlan extends WorkoutPlan {
    public StrengthTrainingPlan(double duration) {
        super(duration);
    }

    public double calculateCaloriesBurned() {
        return super.calculateCaloriesBurned() + (duration * 3.0);
    }
}
