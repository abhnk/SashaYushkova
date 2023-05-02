package ua.hillel.hw8;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

    public static void log(LogLevel level, String message) {
        LOGGER.log(level.getLevel(), level.getColorCode() + message + "\u001B[0m");
    }

    public enum LogLevel {
        INFO("\u001B[32m", Level.INFO),
        DEBUG("\u001B[34m", Level.FINE),
        WARN("\u001B[33m", Level.WARNING),
        ERROR("\u001B[31m", Level.SEVERE);

        private final String colorCode;
        private final Level level;

        LogLevel(String colorCode, Level level) {
            this.colorCode = colorCode;
            this.level = level;
        }

        public String getColorCode() {
            return colorCode;
        }

        public Level getLevel() {
            return level;
        }
    }
}
