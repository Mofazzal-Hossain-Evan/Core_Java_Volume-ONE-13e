package SmartHomeAutomation;

import java.util.ArrayList;

public class SmartHomeController {

    private ArrayList<SmartDevice> devices = new ArrayList<>();
    private MotionSensor motionSensor = new MotionSensor();

    public void addDevice(SmartDevice device){
        devices.add(device);
        System.out.println(device.name +  " স্মার্ট হোমে যোগ করা হয়েছে ✅");
    }

    public void showDevices(){
        motionSensor.detectMotion();
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void detectMotion(){
        motionSensor.detectMotion();
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void clearMotion(){
        motionSensor.clearMotion();
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
