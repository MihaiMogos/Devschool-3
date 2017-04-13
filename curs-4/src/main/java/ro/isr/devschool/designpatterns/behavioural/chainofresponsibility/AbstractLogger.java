package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

import lombok.Setter;

/**
 * Created by crist on 06-Apr-17.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // next element in chain of responsibility
    @Setter
    protected AbstractLogger nextLogger;

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}