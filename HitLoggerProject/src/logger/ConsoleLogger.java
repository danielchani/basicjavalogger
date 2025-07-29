package logger;

/**
 * For open closed principle, we will use the consoleLogger
 */
public class ConsoleLogger implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("INFO: " + msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println("DEBUG: " + msg);
    }

    @Override
    public void error(String msg) {
        System.err.println("ERROR: " + msg);
    }
}
