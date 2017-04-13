package ro.isr.devschool.designpatterns.behavioural.chainofresponsibility;

/**
 * Created by crist on 06-Apr-17.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to console: " + message);
    }
}
