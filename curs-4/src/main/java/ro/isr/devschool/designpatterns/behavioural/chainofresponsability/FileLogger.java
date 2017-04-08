package ro.isr.devschool.designpatterns.behavioural.chainofresponsability;

/**
 * Created by Mucefix on 06/04/17.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Writing message to File: "+message);
    }
}
