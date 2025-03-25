package SmartHomeAutomation;

public class SmartAC extends SmartDevice{
    private double currentTemperature;
    private  double desiredTemperature;

    public SmartAC(String name,  double powerUsage, double desiredTemperature) {
        super(name, powerUsage);

        this.currentTemperature = 30.0;
        this.desiredTemperature = desiredTemperature;
    }

    public void setCurrentTemperature(double temperature){
       this.desiredTemperature = temperature;
        System.out.println(name + " এর সেট করা তাপমাত্রা: " + temperature + "°C");
    }

    public void adjustTemperature(){
        if (currentTemperature > desiredTemperature) {
            turnOn();
            System.out.println("❄️ " + name + " চালু হলো, কারণ তাপমাত্রা বেশি! (বর্তমান: " + currentTemperature + "°C)");
        } else {
            turnOff();
            System.out.println("☀️ " + name + " বন্ধ হলো, কারণ তাপমাত্রা কম! (বর্তমান: " + currentTemperature + "°C)");
        }
    }

    @Override
    public void displayStatus(){
        System.out.println("❄️ " + name + " | স্ট্যাটাস: " + (status ? "ON" : "OFF") + " | সেট তাপমাত্রা: " + desiredTemperature + "°C");
    }

}
