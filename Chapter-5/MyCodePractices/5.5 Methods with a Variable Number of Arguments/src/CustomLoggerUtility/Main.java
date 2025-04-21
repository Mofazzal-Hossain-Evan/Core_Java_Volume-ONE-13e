package CustomLoggerUtility;


public class Main {
    public static void main(String[] args) {
        String user = "Alice";
        int userId = 102;
        String time = "8:01 AM";

        Logger.log("INFO", "User", user, "with ID", userId, "logged in at", time);
        Logger.warning("Disk space low on drive C:");
        Logger.error("Cannot connect to database", "Retrying...");

        //Optional
        Logger.info("This is a short info message.");
        Logger.error("Unexpected error occurred!", "Code:", 503);
    }
}
