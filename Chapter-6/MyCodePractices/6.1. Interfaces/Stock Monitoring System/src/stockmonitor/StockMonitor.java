// StockMonitor.java
package stockmonitor;

// Correct imports for Timer and ActionListener
import javax.swing.Timer; // Use javax.swing.Timer for ActionListener
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.*;

// Main class for monitoring stocks
public class StockMonitor {
    private List<Stock> stocks = new ArrayList<>(); // List to store stocks
    private AlertService alertService;            // Service for sending alerts
    private Scanner scanner = new Scanner(System.in); // Scanner for user input

    // Inner class to handle price update events
    private class UpdateHandler implements ActionListener {
        private Stock stock;                      // Stock to monitor

        // Constructor
        public UpdateHandler(Stock stock) {
            this.stock = stock;              // Initialize stock
        }

        // Handle price update event
        @Override
        public void actionPerformed(ActionEvent e) {
            // Simulate a random price update for demonstration
            double newPrice = stock.getPrice() + (Math.random() * 10 - 5); // Random change ±5
            stock.updatePrice(newPrice); // Update stock price
            alertService.sendAlert(stock.getSymbol() + ": $" + String.format("%.2f", stock.getPrice())); // Send alert
        }
    }

    // Constructor with alert service
    public StockMonitor(AlertService alertService) {
        this.alertService = alertService;         // Initialize alert service
    }

    // Add stock to monitoring list
    public void addStock(Stock stock) {
        stocks.add(stock);                   // Add stock to list
        UpdateHandler handler = new UpdateHandler(stock); // Create handler
        // Use javax.swing.Timer with delay in milliseconds and ActionListener
        new Timer(5000, handler).start(); // Update every 5 seconds
    }

    // Update price using reflection
    public void updatePriceWithReflection(Stock stock, double newPrice) {
        try {
            // Get updatePrice method
            Method method = Stock.class.getDeclaredMethod("updatePrice", double.class);
            method.setAccessible(true); // Allow private method access
            method.invoke(stock, newPrice); // Invoke method on stock
            System.out.println("Price updated via reflection: " + newPrice); // Confirm update
        } catch (Exception e) {
            System.err.println("Reflection error: " + e.getMessage()); // Handle errors
        }
    }

    // Sort stocks using lambda
    public void sortStocksByPrice() {
        stocks.sort((s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice())); // Lambda for price sorting
        System.out.println("Stocks sorted by price:"); // Display header
        stocks.forEach(System.out::println); // Print each stock
    }

    // Sort stocks by date using Comparator
    public void sortStocksByDate() {
        stocks.sort(new DateComparator()); // Use DateComparator
        System.out.println("Stocks sorted by date:"); // Display header
        stocks.forEach(System.out::println); // Print each stock
    }

    // Check price change using lambda
    public void checkPriceChange() {
        stocks.forEach(stock -> {
            double oldPrice = stock.getPrice(); // Store old price
            double newPrice = oldPrice + (Math.random() * 10 - 5); // Simulate new price ±5
            if (Math.abs(newPrice - oldPrice) > 5) { // Check change > $5
                updatePriceWithReflection(stock, newPrice); // Update price
            }
        });
    }

    // Console menu
    public void start() {
        while (true) {
            System.out.println("\nStock Monitor Menu:");
            System.out.println("1. Add Tech Stock");
            System.out.println("2. Add Finance Stock");
            System.out.println("3. Sort by Price");
            System.out.println("4. Sort by Date");
            System.out.println("5. Check Price Changes");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt(); // Get user choice
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Symbol: ");
                    String techSymbol = scanner.nextLine(); // Get symbol
                    System.out.print("Price: ");
                    double techPrice = scanner.nextDouble(); // Get price
                    scanner.nextLine();
                    System.out.print("Sector: ");
                    String sector = scanner.nextLine(); // Get sector
                    addStock(new TechStock(techSymbol, techPrice, sector)); // Add tech stock
                    break;
                case 2:
                    System.out.print("Symbol: ");
                    String finSymbol = scanner.nextLine(); // Get symbol
                    System.out.print("Price: ");
                    double finPrice = scanner.nextDouble(); // Get price
                    scanner.nextLine();
                    System.out.print("Institution Type: ");
                    String type = scanner.nextLine(); // Get type
                    addStock(new FinanceStock(finSymbol, finPrice, type)); // Add finance stock
                    break;
                case 3:
                    sortStocksByPrice(); // Sort by price
                    break;
                case 4:
                    sortStocksByDate(); // Sort by date
                    break;
                case 5:
                    checkPriceChange(); // Check price changes
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return; // Exit program
                default:
                    System.out.println("Invalid choice!"); // Handle invalid input
            }
        }
    }

    // Main method to run the system
    public static void main(String[] args) {
        AlertService consoleService = new ConsoleAlertService(); // Create console service
        AlertService proxyService = new AlertProxy(consoleService, 10.0, 0.0); // Create proxy with $10 threshold
        StockMonitor monitor = new StockMonitor(proxyService); // Create monitor
        monitor.start(); // Start the system
    }
}