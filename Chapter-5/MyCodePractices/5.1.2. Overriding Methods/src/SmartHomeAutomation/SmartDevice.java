package SmartHomeAutomation;

abstract class SmartDevice {

    protected String name;
    protected boolean status;
    protected double powerUsage;

    public SmartDevice(String name, double powerUsage) {
        this.name = name;
        this.status = status;
        this.powerUsage = powerUsage;
    }

    public void turnOn(){
        status = true;
        System.out.println(name +" চালু করা হলো ✅");
    }

    public void turnOff(){
        status = false;
        System.out.println(name + " বন্ধ করা হলো ❌");
    }
    public double getEnergyConsumption(int hours){
        return status ? powerUsage * hours : 0; // অন থাকলে বিদ্যুৎ খরচ দেখাবে
    }
    public abstract void displayStatus(); // প্রতিটি ডিভাইসের জন্য আলাদা স্ট্যাটাস
}
