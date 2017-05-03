package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

/**
 * Created by Andrei on 06.04.2017.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLoggers();
       // loggerChain.logMessage(AbstractLogger.INFO,"This is an information");

       // loggerChain.logMessage(AbstractLogger.DEBUG,"this is a debug info");
        loggerChain.logMessage(AbstractLogger.ERROR,"this is an error info");


    }
}
