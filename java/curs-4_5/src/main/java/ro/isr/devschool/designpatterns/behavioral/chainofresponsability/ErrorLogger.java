package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

/**
 * Created by Andrei on 06.04.2017.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("writing message to error logger: "+message);
    }
}
