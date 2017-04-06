package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to Error Logger: " + message);
    }
}
