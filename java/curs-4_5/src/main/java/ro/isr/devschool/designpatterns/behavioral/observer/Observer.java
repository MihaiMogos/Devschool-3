package ro.isr.devschool.designpatterns.behavioral.observer;

/**
 * Created by Andrei on 13.04.2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
