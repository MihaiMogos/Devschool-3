package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

/**
 * Created by Andrei on 06.04.2017.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("writing message to console "+message);
    }
}
