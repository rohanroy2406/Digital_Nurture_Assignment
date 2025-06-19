// File: Logger.java
public class Logger {
    // Step 2: Private static instance of the same class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create only if not already created
        }
        return instance;
    }

    // Sample method to simulate logging
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
