package PersonalizedFitnessTracker;

import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Workout Type: (1) Yoga, (2) Cardio, (3) Strength Training");
        int choice = scanner.nextInt();

        System.out.println("Enter workout duration in minutes: ");
        double duration = scanner.nextDouble();

        WorkoutPlan workout; // Reference variable for dynamic method dispatch

        /*
         🔹 Dynamic Method Dispatch কী?
         ✅ Polymorphism হল OOP-এর একটি গুরুত্বপূর্ণ ধারণা,
         যেখানে একটি সুপারক্লাসের রেফারেন্স ভেরিয়েবল সাবক্লাসের অবজেক্ট ধারণ করতে পারে।
         ✅ যখন আমরা workout নামের রেফারেন্স ভেরিয়েবল ব্যবহার করি,
         তখন এটি সুপারক্লাস (WorkoutPlan) থেকে সাবক্লাসের (YogaPlan, CardioPlan, StrengthTrainingPlan)
         ওভাররাইড করা মেথড কল করতে পারে।
         ✅ এটি Runtime Polymorphism বা Dynamic Method Dispatch নামে পরিচিত।
         */

        switch (choice) {
            case 1 :
                workout = new YogaPlan(duration);
                System.out.println("Yoga Workout Selected.");
                break;

            case 2 :
                workout = new CardioPlan(duration);
                System.out.println("Cardio Workout Selected.");
                break;

            case 3:
                workout = new StrengthTrainingPlan(duration);
                System.out.println("Strength Training Workout Selected.");
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Yoga.");
                workout = new YogaPlan(duration);
        }
        System.out.println("Estimated Calories Burned: " + workout.calculateCaloriesBurned()+ " kcal");
        scanner.close();

    }
}
