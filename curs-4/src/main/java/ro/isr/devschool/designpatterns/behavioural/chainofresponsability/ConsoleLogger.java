package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to console: " + message);
    }
}
