package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Writing message to Error Logger: "+message);
    }
}
