package Superhero_Universe_System;

public interface Flyable extends Powered {

    double MAX_HEIGHT = 10000.0;

    void fly(double height);

    // =====================
    // 6.1.4 — Default methods (দুটো)
    // দুটোই একই private helper ব্যবহার করে
    // এটাই DRY principle — notes এর Validator example
    // =====================

    default boolean canFlyHigh(double height) {
        // checkAltitude() → private helper
        return checkAltitude(height) && checkStamina();
    }

    default String getFlightStatus(double height) {
        // checkAltitude() → same private helper আবার!
        // না থাকলে দুবার একই code লিখতে হতো
        if (checkAltitude(height)) {
            return "✅ Safe to fly at " + height + "m";
        } else {
            return "❌ Too high! MAX = " + MAX_HEIGHT + "m";
        }
    }

    // =====================
    // 6.1.4 — Private Methods
    // রান্নাঘরের গোপন recipe
    // বাইরে দেখা যায় না — শুধু এই interface এর ভেতরে
    // canFlyHigh() আর getFlightStatus() দুটোই এটা ব্যবহার করে
    // =====================

    private boolean checkAltitude(double height) {
        return height <= MAX_HEIGHT;
    }

    private boolean checkStamina() {
        return true;
    }
}