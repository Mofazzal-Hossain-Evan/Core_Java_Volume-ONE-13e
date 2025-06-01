package TaskManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        var scaanner = new Scanner(System.in);
        var tasks = new ArrayList<String>();


        while (true) {
            System.out.print("Enter a task (or type 'exit' to stop): ");

            var input = scaanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) break;
            var task = Objects.requireNonNullElse(input.trim().isEmpty() ? null : input, "Unnamed Task");
            tasks.add(task);
        }
        System.out.println("\nYour Tasks: ");
        for (var task : tasks){
            System.out.println("_ " + task);
        }
        scaanner.close();
    }
}
