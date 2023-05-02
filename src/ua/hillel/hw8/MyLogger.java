package ua.hillel.hw8;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    private static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

    public static void log(LogLevel level, String message) {
        LOGGER.log(level.getLevel(), message);
    }

    public enum LogLevel {
        INFO(Level.INFO),
        DEBUG(Level.FINE),
        WARN(Level.WARNING),
        ERROR(Level.SEVERE);

        private Level level;

        LogLevel(Level level) {
            this.level = level;
        }

        public Level getLevel() {
            return level;
        }
    }

    public void test() {
        MyLogger.log(LogLevel.ERROR, "Error");
    }
}



