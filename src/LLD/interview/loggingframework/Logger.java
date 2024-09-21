package src.LLD.interview.loggingframework;

import src.LLD.interview.loggingframework.output.ConsoleAppender;
import src.LLD.interview.loggingframework.output.OutputAppender;

public class Logger {

    private static volatile Logger logger;  // volatile to ensure thread-safe publication of the instance
    private LogConfig logConfig;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Initialize with default configuration (ConsoleAppender and INFO level)
        logConfig = new LogConfig(LogLevel.INFO, new ConsoleAppender());
    }

    // Static method to return the singleton instance of Logger
    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    // Main logging method with level filtering
    public void log(String message, LogLevel logLevel) {
        LogMessage logMessage = new LogMessage(message, logLevel);
        if (logLevel.ordinal() >= logConfig.getLogLevel().ordinal()) {
            logConfig.getOutputAppender().append(logMessage);
        }
    }

    // Convenience methods for different log levels
    public void warn(String message) {
        log(message, LogLevel.WARN);
    }

    public void debug(String message) {
        log(message, LogLevel.DEBUG);
    }

    public void error(String message) {
        log(message, LogLevel.ERROR);
    }

    public void info(String message) {
        log(message, LogLevel.INFO);
    }

    // Getters and setters for log configuration
    public LogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }
}