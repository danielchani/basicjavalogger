package main;

import logger.Logger;
import logger.LoggerImpl;
// import logger.ConsoleLogger,

import java.util.Scanner;

/**
 * מיין קלאס שמדגים שימוש בלוגר
 */
public class LoggerMain {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl("application.log");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter log level (info/debug/error): ");
        String level = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter log message: ");
        String message = scanner.nextLine();

        switch (level) {
            case "info" -> logger.info(message);
            case "debug" -> logger.debug(message);
            case "error" -> logger.error(message);
            default -> System.out.println("Invalid log level");
        }

        System.out.println("Log recorded: " + level.toUpperCase() + " - " + message);
    }
}
