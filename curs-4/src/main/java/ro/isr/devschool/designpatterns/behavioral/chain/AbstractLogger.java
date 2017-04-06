package ro.isr.devschool.designpatterns.behavioral.chain;


import lombok.Setter;

/**
 * Created by scipianus on 06-Apr-17.
 */
public abstract class AbstractLogger {
    protected LogLevel logLevel;

    @Setter
    protected AbstractLogger nextLogger;

    public void logMessage(LogLevel logLevel, String message) {
        if (this.logLevel.getLevel() <= logLevel.getLevel()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }
    }

    protected abstract void write(String message);
}
