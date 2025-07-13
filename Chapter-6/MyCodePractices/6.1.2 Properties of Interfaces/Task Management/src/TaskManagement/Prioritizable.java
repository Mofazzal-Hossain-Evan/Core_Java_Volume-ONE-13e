package TaskManagement;

public sealed interface Prioritizable permits WorkTask, UrgentTask {
    int MAX_PRIORITY = 10;
    int getPriority();
    int getMaxPriority(); // ← এই method আছে
}
