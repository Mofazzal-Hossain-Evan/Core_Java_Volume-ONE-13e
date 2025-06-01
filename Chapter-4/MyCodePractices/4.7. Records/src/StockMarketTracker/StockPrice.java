package StockMarketTracker;

import java.security.PrivateKey;

public class StockPrice {

    private String symbol;
    private double price;
    private long volume;
    private long timestamp;

    public StockPrice(String symbol, double price, long volume) {
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.timestamp = System.currentTimeMillis();
    }

    public String toString(){
        return "StockPrice{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", timestamp=" + timestamp +
                '}';
    }
}
