package ro.isr.devschool.designpatterns.behavioral.observer.observers;

import ro.isr.devschool.designpatterns.behavioral.observer.Subject;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
