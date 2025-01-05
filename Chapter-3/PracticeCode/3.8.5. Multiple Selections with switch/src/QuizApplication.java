import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz!");

        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the default value of an int in Java?");
        System.out.println("1. 0\n2. null\n3. 1\n4. undefined");
        System.out.print("Your choice: ");
        int c1 = input.nextInt();

        if(c1 == 1 ) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is 1. 0");
        }

        // Question 2
        System.out.println("\nQuestion 2: Which of these is not a keyword in Java?");
        System.out.println("1. static\n2. void\n3. main\n4. private");
        System.out.print("Your choice: ");

        int c2 = input.nextInt();
        if(c2 == 3) {
            System.out.println("Correct!");
            score ++;
        } else {
            System.out.println("Wrong! The correct answer is 3. main");
        }

        // Question 3
        System.out.println("\nQuestion 3: What does JVM stand for?");
        System.out.println("1. Java Virtual Machine\n2. Java Variable Manager\n3. Java Version Monitor\n4. None of the above");
        System.out.print("Your choice: ");
        int c3 = input.nextInt();
        if (c3 == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is 1. Java Virtual Machine");
        }

        // Display final score
        System.out.println("\nYour final score is: " + score + " out of 3");

        if (score == 3) {
            System.out.println("Excellent! You're a Java pro!");
        } else if (score == 2) {
            System.out.println("Good job! A little more practice and you'll ace it.");
        } else {
            System.out.println("Keep learning! You'll get there.");
        }
input.close();

    }

}
