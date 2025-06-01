package EmployeeParkingEligibilityChecker;

final class Executive implements Employee {
    private final String title;

    public Executive(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
