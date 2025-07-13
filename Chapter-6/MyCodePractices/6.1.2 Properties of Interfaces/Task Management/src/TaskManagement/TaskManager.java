package TaskManagement;

import java.util.*;

public class TaskManager {
    public static void main(String[] args) {
        List<Object> tasks = new ArrayList<>();

        tasks.add(new WorkTask("Finish report", 7));
        tasks.add(new PersonalTask("Buy groceries"));
        tasks.add(new UrgentTask("Fix server issue"));
        tasks.add(new WorkTask("Team meeting", 5));
        tasks.add(new PersonalTask("Call mom"));

        System.out.println("🔄 All Tasks:");
        for (Object task : tasks) {
            System.out.println(task);
        }

        System.out.println("\n🔼 Sorting Prioritizable Tasks:");
        tasks.stream()
                .filter(t -> t instanceof Prioritizable)
                .map(t -> (Prioritizable) t)
                .sorted(Comparator.comparingInt(Prioritizable::getPriority).reversed())
                .forEach(System.out::println);

        System.out.println("\n🗄️ Archiving All Archivable Tasks:");
        for (Object task : tasks) {
            if (task instanceof Archivable archivable) {
                archivable.archive();
            }
        }
    } // <-- main method শেষ

} // <-- TaskManager class শেষ
