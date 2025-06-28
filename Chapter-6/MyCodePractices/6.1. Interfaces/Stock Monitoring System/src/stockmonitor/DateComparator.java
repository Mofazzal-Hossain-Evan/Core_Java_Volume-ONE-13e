// DateComparator.java
package stockmonitor;

// Import the Comparator interface from java.util
import java.util.Comparator;

// Comparator for sorting Stocks by last update time
public class DateComparator implements Comparator<Stock> {
    // Compare two stocks based on their last update time
    @Override
    public int compare(Stock s1, Stock s2) {
        return s1.getLastUpdate().compareTo(s2.getLastUpdate()); // Compare timestamps
    }
}