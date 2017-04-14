package ro.isr.devschool.designpatterns.behavioral.observer;

import ro.isr.devschool.designpatterns.behavioral.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
