package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mucefix on 13/04/17.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+ Integer.toBinaryString(subject.getStatte()));
    }
}
