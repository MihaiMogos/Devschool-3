package ro.isr.devschool.designpatterns.behavioral.observer.observers;

import ro.isr.devschool.designpatterns.behavioral.observer.Subject;

/**
 * Created by scipianus on 13-Apr-17.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
