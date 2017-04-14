package ro.isr.devschool.designpatterns.behavioral.observer.observers;

import ro.isr.devschool.designpatterns.behavioral.observer.Subject;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
