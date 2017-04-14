package ro.isr.devschool.designpatterns.behavioral.observer;

/**
 * Created by lav on 4/13/2017.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
