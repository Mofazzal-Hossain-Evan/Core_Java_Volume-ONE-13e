package stockmonitor;

public class AlertProxy implements  AlertService{
    private final AlertService realService;
    private final double threshold;
    private  double lastPrice;

    public AlertProxy(AlertService realService, double threshold, double initialPrice) {
        this.realService = realService;
        this.threshold = threshold;
        this.lastPrice = initialPrice;
    }
    @Override
    public void sendAlert(String message){
        String[] parts = message.split(":");
        if (parts.length > 1){
            try{
                double currentPrice = Double.parseDouble(parts[1].trim().replace("$", ""));
                if (Math.abs(currentPrice - lastPrice) >= threshold){
                    realService.sendAlert(message);
                    lastPrice = currentPrice;
                }
            } catch (NumberFormatException e){
                System.out.println("Error parsing price: " + e.getMessage());
            }
        }
    }
}
