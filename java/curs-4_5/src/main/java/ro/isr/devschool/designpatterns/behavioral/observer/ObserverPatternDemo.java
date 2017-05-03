package ro.isr.devschool.designpatterns.behavioral.observer;

/**
 * Created by Andrei on 13.04.2017.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("first state change: 15");
        subject.setState(15);

        System.out.println("second state change: 10");
        subject.setState(10);
    }
}
