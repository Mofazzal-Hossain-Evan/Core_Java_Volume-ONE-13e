package plugins;

import core.Plugin;

public class LogPlugin extends Plugin {
    private String log = "";

    // ব্যাখ্যা: logEvent ইভেন্ট লগ করে।
    public void logEvent(String eventDetails) {
        log += eventDetails + "\n";
        System.out.println("Logged: " + eventDetails);
    }

    // ব্যাখ্যা: displayLogs লগ প্রদর্শন করে।
    public void displayLogs() {
        System.out.println("Event Logs:\n" + log);
    }

    @Override
    public String getDescription() {
        return "Log Plugin for event logging";
    }
}