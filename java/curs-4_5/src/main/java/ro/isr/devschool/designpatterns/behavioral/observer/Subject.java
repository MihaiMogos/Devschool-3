package ro.isr.devschool.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getStatte(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }

}