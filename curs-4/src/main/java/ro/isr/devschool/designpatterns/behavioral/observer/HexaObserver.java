package ro.isr.devschool.designpatterns.behavioral.observer;

import java.util.*;

/**
 * Created by lav on 4/13/2017.
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String " + Integer.toHexString(subject.getState()));
    }
}
