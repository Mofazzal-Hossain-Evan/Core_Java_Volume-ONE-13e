package AiFitnessCoach;

public class FitnessApp {
    public static void main(String[] args) {

        Coach basicCoach = new Coach();
        AICoach smartCoach = new AICoach();

        //method Overloading
        basicCoach.suggestWorkout();
        basicCoach.suggestWorkout(49);
        basicCoach.suggestWorkout("High");

        // Method Overriding & Dynamic Binding
        Coach myCoach = new AICoach();
        myCoach.suggestWorkout();
        //ekhane input dile ar overwrite er method call hoy na
    }
}
