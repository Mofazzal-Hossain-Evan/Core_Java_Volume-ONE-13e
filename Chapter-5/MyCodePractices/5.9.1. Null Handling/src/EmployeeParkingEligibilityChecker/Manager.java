package EmployeeParkingEligibilityChecker;

final class Manager implements Employee {
    private final int bonus;

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
