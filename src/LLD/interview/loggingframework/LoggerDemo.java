package src.LLD.interview.loggingframework;

import src.LLD.interview.loggingframework.output.FileAppender;

public class LoggerDemo {

    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        logger.info("This is an info message!");
        logger.setLogConfig(new LogConfig(LogLevel.WARN, new FileAppender("./log.txt")));
        logger.info("This is info 2");
        logger.error("Uh oh, error happens");
    }
}
