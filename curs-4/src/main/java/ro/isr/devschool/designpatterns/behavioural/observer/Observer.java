package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mucefix on 13/04/17.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
