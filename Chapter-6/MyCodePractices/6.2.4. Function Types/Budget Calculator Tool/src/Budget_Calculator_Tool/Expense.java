/* Package declaration */
package Budget_Calculator_Tool;

/* থিয়রি: *Core Java* (p. 274) বলে, POJO ক্লাস খরচ হোল্ড করে, যা ল্যামডা দিয়ে প্রসেস করা যায়। */

public class Expense {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    // Getters
    public String getCategory() { return category; }
    public double getAmount() { return amount; }

    // Setter for amount (if scaled)
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return category + " | Amount: $" + String.format("%.2f", amount);
    }
}