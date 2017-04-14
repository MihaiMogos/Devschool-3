package ro.isr.devschool.designpatterns.behavioral.observer;

import java.util.*;

/**
 * Created by lav on 4/13/2017.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String " + Integer.toBinaryString(subject.getState()));
    }
}
