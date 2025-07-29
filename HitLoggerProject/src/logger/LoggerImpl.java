package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *Logger implementation that writes logs to files
 */
public class LoggerImpl implements Logger {
    private final String filePath;

    public LoggerImpl(String filePath) {
        this.filePath = filePath;
    }

    private void log(String level, String msg) {
        String timestamp = LocalDateTime.now().toString();
        String formatted = timestamp + " " + level.toUpperCase() + " " + msg;

        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(formatted + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("ERROR writing to log file: " + e.getMessage());
        }
    }

    @Override
    public void info(String msg) {
        log("INFO", msg);
    }

    @Override
    public void debug(String msg) {
        log("DEBUG", msg);
    }

    @Override
    public void error(String msg) {
        log("ERROR", msg);
    }
}
