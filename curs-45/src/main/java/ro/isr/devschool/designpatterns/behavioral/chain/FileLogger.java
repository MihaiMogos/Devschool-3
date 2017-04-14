package ro.isr.devschool.designpatterns.behavioral.chain;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to a file: " + message);
    }
}
