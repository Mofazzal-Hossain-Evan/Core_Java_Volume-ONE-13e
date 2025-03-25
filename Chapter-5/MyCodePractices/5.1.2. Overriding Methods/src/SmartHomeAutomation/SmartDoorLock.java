package SmartHomeAutomation;

public class SmartDoorLock {
    boolean isLocked;
    private String password;

    public SmartDoorLock( String password) {
        this.isLocked = isLocked;
        this.password = password;
    }

    public void unlock(String inputPassword){
        if (inputPassword.equalsIgnoreCase(password)){
            isLocked = false;
            System.out.println("🔓 দরজা আনলক করা হলো ✅");
        } else {
            System.out.println("❌ ভুল পাসওয়ার্ড! দরজা লক থাকবে 🚪");
        }
    }

    public void lock(){
        isLocked = true;
        System.out.println("🔒 দরজা লক করা হলো ✅");
    }

    public void displayStatus(){
        System.out.println("🚪 দরজার অবস্থা: " + (isLocked ? "🔒 লকড" : "🔓 আনলকড"));
    }
}
