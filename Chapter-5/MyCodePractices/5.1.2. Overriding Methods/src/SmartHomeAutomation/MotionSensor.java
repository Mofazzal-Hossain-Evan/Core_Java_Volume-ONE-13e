package SmartHomeAutomation;

public class MotionSensor {
    private boolean motionDetected;

    public void detectMotion(){
        motionDetected = true;
        System.out.println("🕵️ মুভমেন্ট শনাক্ত করা হয়েছে! ডিভাইস চালু হচ্ছে...");
    }

    public void clearMotion(){
        motionDetected = false;
        System.out.println("🔇 কোনো মুভমেন্ট নেই, ডিভাইস বন্ধ হবে...");
    }

    public boolean isMotionDetected(){
        return motionDetected;
    }
}
