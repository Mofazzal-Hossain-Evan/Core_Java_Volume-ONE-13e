package PersonalizedFitnessTracker;

class CardioPlan extends WorkoutPlan {
    public CardioPlan(double duration) {
        super(duration);
    }

    public double calculateCaloriesBurned() {
        return super.calculateCaloriesBurned() + (duration * 2.5);
    }
}
