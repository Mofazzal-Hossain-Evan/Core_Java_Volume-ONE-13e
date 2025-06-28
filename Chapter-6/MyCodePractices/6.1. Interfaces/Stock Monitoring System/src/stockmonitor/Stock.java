// Stock.java
package stockmonitor;

// Import for handling date and time
import java.time.LocalDateTime;

// Stock class represents a stock with symbol, price, and last update time
public class Stock implements Comparable<Stock> {
    // Private fields for encapsulation
    private String symbol;          // Stock symbol (e.g., "AAPL")
    private double price;          // Current price of the stock
    private LocalDateTime lastUpdate; // Timestamp of last price update

    // Constructor to initialize stock with symbol and price
    public Stock(String symbol, double price) {
        this.symbol = symbol;       // Assign symbol parameter to field
        this.price = price;         // Assign price parameter to field
        this.lastUpdate = LocalDateTime.now(); // Set initial update time to current time
    }

    // Getter for symbol
    public String getSymbol() {
        return symbol;              // Return the stock symbol
    }

    // Getter for price
    public double getPrice() {
        return price;               // Return the current price
    }

    // Getter for last update time
    public LocalDateTime getLastUpdate() {
        return lastUpdate;          // Return the last update timestamp
    }

    // Method to update stock price and timestamp
    public void updatePrice(double newPrice) {
        this.price = newPrice;      // Update price with new value
        this.lastUpdate = LocalDateTime.now(); // Update timestamp to current time
    }

    // Implementation of Comparable interface to compare stocks by price
    @Override
    public int compareTo(Stock other) {
        return Double.compare(this.price, other.price); // Compare prices using Double.compare
    }

    // String representation of the stock for display
    @Override
    public String toString() {
        return String.format("%s: $%.2f [%s]", symbol, price, lastUpdate); // Format: symbol, price, timestamp
    }
}