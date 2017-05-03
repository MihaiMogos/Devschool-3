package ro.isr.devschool.designpatterns.behavioral.observer;

/**
 * Created by Andrei on 13.04.2017.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: "+ Integer.toHexString(subject.getStatte()));
    }
}