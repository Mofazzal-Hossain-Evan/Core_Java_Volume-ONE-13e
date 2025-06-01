package LoggerFactory;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    private static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[LOG]: "+ message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        System.out.println("Are both instances the same? " +(logger1 == logger2));
    }
}
