package EmployeePerformanceTrackerwithRandomizedProductivityScores;

import java.util.Random;

public class Employee {
    private String name;
    private double salary;
    private int performanceScore;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.performanceScore = generateScore(); //The method generateScore() is a private helper method that generates a random performance score. Instead of manually assigning a score in the constructor,
        // we call generateScore() to automatically set a random value when an Employee object is created.
    }

    private int generateScore(){
        Random rand = new Random();
        return rand.nextInt(100)+1; // Score between 1 and 100
    }

    public void checkPerformanceBonus(){
        if (performanceScore >= 90) {
            System.out.println("🏆 " + name + " is a top performer! Salary increased by 10%.");
            raiseSalary(10);
        }
    }

    public void raiseSalary(double byPercent){
        salary =+ salary * (byPercent / 100);
    }
    public void displayInfo(){
        System.out.println(name + " | Salary: $" + salary + " | Performance Score: " + performanceScore);

    }

}
