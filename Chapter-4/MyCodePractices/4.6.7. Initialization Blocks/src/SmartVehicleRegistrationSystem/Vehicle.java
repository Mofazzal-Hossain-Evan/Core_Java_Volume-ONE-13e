package SmartVehicleRegistrationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.random.RandomGenerator;

public class Vehicle {

    private static Map<String, Integer> cityWiseReg = new HashMap<>();
    private static RandomGenerator generator = RandomGenerator.getDefault();

    private String registrationNumber;
    private String city;

    static {
        cityWiseReg.put("New City", 600);
        cityWiseReg.put("Dhaka", 400);
    }

    {
        if (city != null && cityWiseReg.containsKey(city)){
            registrationNumber = city + "_" + cityWiseReg.get(city);
            cityWiseReg.put(city, cityWiseReg.get(city));
            /***
             cityWiseReg.put(city, cityWiseReg.get(city) + 1);

             🔍 এই লাইন কী করে?

             cityWiseReg হল একটি HashMap, যেখানে প্রতিটি শহরের জন্য একটি সংখ্যা রাখা হচ্ছে (রেজিস্ট্রেশন নম্বর)।
             cityWiseReg.get(city) → বর্তমান শহরের জন্য সংরক্ষিত নম্বর খুঁজে আনে।
             cityWiseReg.get(city) + 1 → বিদ্যমান নম্বরের সাথে ১ যোগ করে নতুন মান তৈরি করে।
             cityWiseReg.put(city, নতুন মান) → আপডেট করা নতুন মান Map-এ সংরক্ষণ করে।
             📌 সহজ ভাষায়:
             এই লাইনটি নির্দিষ্ট একটি শহরের রেজিস্ট্রেশন নম্বর ১ বাড়িয়ে দেয়,
             যেন পরবর্তী রেজিস্ট্রেশন একটি নতুন নম্বর পায়। 🚗💨
             */
        }
    }

    public Vehicle(String city) {
        this.city = city;
    }

    public void display(){
        System.out.println("Vehicle [Registration=" + registrationNumber + ", City=" + city + "]");

    }

    public static void main(String[] args) {
        System.out.println("\n🔹 Vehicle Test");
        Vehicle car1 = new Vehicle("New York");
        car1.display();
    }
}
