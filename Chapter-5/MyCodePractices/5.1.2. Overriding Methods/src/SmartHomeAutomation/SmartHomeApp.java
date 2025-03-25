package SmartHomeAutomation;

import java.util.Scanner;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeController home = new SmartHomeController();
        Scanner scanner = new Scanner(System.in);

        SmartLight light = new SmartLight("ড্রয়িং রুম লাইট", 0.05);
        SmartFan fan = new SmartFan("বেডরুম ফ্যান", 0.1);
        SmartAC ac = new SmartAC("বেডরুম AC", 1.5, 24.0);
        SmartDoorLock door = new SmartDoorLock("1234");

        home.addDevice(light);
        home.addDevice(fan);
        home.addDevice(ac);

        while (true) {
            System.out.println("\n🏡 স্মার্ট হোম মেনু:");
            System.out.println("1️⃣ ডিভাইস লিস্ট দেখুন");
            System.out.println("2️⃣ মুভমেন্ট শনাক্ত করুন");
            System.out.println("3️⃣ মুভমেন্ট বন্ধ করুন");
            System.out.println("4️⃣ AC তাপমাত্রা পরিবর্তন করুন");
            System.out.println("5️⃣ দরজা আনলক করুন");
            System.out.println("6️⃣ দরজা লক করুন");
            System.out.println("7️⃣ প্রস্থান করুন");
            System.out.print("👉 আপনার পছন্দ: ");


            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    home.showDevices();
                    door.displayStatus();
                    break;
                case 2:
                    home.detectMotion();
                    break;
                case 3:
                    home.clearMotion();
                    break;
                case 4:
                System.out.print("❄️ নতুন তাপমাত্রা সেট করুন: ");
                String pass = scanner.next();
                door.unlock(pass);
                break;
                case 6:
                    door.lock();
                    break;
                case 7:
                    System.out.println("👋 স্মার্ট হোম থেকে বাহির হচ্ছেন...");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠️ ভুল পছন্দ! আবার চেষ্টা করুন।");

            }
        }
    }
}
