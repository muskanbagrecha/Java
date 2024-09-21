package src.LLD.interview.loggingframework;

import java.time.LocalDateTime;

public class LogMessage {
    private String message;
    private LocalDateTime time;
    private LogLevel logLevel;

    public LogMessage(String message, LogLevel logLevel){
        this.logLevel = logLevel;
        this.message = message;
        time = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    @Override
    public String toString() {
        return this.getLogLevel().toString() + "::" + this.getMessage() + "\n" + this.getTime().toString();
    }
}
