package SmartHomeAutomation;

 class SmartFan extends  SmartDevice{
    private int speed;

    public SmartFan(String name,double powerUsage) {
        super(name, powerUsage);
        this.speed = 1;
    }

    public void setSpeed(int level) {
        if (level >= 1 && level <= 5) {
            speed = level;
            System.out.println(name + " স্পিড সেট করা হলো " + level);
        } else {
            System.out.println("⚠️ ভুল স্পিড মান! (1-5 এর মধ্যে দিন)");
        }
    }

    @Override
    public void displayStatus(){
        System.out.println("🌀 " + name + " | স্ট্যাটাস: " + (status ? "ON" : "OFF") +" | স্পিড: "  + speed );;
    }
}
