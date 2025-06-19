// File: Main.java
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance(); // Should create instance
        Logger logger2 = Logger.getInstance(); // Should return same instance

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton works!");
        } else {
            System.out.println("Different instances found. Singleton failed.");
        }
    }
}
