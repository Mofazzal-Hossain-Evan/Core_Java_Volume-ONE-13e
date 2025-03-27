package CorporateHierarchy;

public class Executive extends Manager {
    private double companyShares;

    public Executive(String name, int age, String address, int employeeID, double salary, String department, int performanceRating, int teamSize, double companyShares) {
        super(name, age, address, employeeID, salary, department, performanceRating, teamSize);
        this.companyShares = companyShares;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company Shares: " + companyShares);
    }
}

