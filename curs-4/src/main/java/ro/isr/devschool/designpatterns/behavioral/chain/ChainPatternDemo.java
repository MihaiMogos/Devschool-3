package ro.isr.devschool.designpatterns.behavioral.chain;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(LogLevel.ERROR);
        AbstractLogger fileLogger = new FileLogger(LogLevel.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(LogLevel.INFO, "This is an INFO message");
        System.out.println();
        loggerChain.logMessage(LogLevel.DEBUG, "This is a DEBUG message");
        System.out.println();
        loggerChain.logMessage(LogLevel.ERROR, "This is an ERROR message");
        System.out.println();
    }
}
