package StockMarketTracker;

import java.util.ArrayList;
import java.util.List;

public class StockTracker {

    private List<StockPrice> stockPrices;

    public StockTracker() {
        stockPrices = new ArrayList<>();
    }
public void addStockData(String symbol, double price, long volume){
        stockPrices.add(new StockPrice(symbol, price, volume));
}

public void printStockData(){
        for (StockPrice price : stockPrices) {
            System.out.println(price);
        }
}

    public static void main(String[] args) {
        StockTracker tracker = new StockTracker();

        tracker.addStockData("AAPL", 145.30, 1000000);
        tracker.addStockData("GOOG", 2800.50, 500000);
        tracker.printStockData();
    }

}
