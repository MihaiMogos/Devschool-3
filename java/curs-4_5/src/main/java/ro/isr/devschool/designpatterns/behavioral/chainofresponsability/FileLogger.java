package ro.isr.devschool.designpatterns.behavioral.chainofresponsability;

import java.io.FilenameFilter;

/**
 * Created by Andrei on 06.04.2017.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("writing message to a file "+message);
    }
}
