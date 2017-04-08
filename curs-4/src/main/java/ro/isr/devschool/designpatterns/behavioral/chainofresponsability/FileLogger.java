package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Writing message to file: "+message);
    }
}
