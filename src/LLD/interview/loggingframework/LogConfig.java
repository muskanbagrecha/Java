package src.LLD.interview.loggingframework;

import src.LLD.interview.loggingframework.output.OutputAppender;

public class LogConfig {
    private OutputAppender outputAppender;
    private LogLevel logLevel;

    public LogConfig(LogLevel logLevel, OutputAppender outputAppender) {
        this.logLevel = logLevel;
        this.outputAppender = outputAppender;
    }

    public OutputAppender getOutputAppender() {
        return outputAppender;
    }

    public void setOutputAppender(OutputAppender outputAppender) {
        this.outputAppender = outputAppender;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
}
