package SmartHomeAutomation;

 class SmartLight extends SmartDevice{
    private int brightness;

    public SmartLight(String name,  double powerUsage) {
        super(name, powerUsage);
        this.brightness = 50;
    }
    public  void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println(name + " এর উজ্জ্বলতা সেট করা হলো " + level + "%");
        } else {
            System.out.println("⚠️ ভুল উজ্জ্বলতা মান! (0-100 এর মধ্যে দিন)");
        }

    }

     @Override
     public void displayStatus() {
         System.out.println("💡 " + name + " | স্ট্যাটাস: " + (status ? "ON" : "OFF") + " | উজ্জ্বলতা: " + brightness + "%");

     }
 }
