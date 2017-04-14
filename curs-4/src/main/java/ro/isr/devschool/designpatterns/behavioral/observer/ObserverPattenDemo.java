package ro.isr.devschool.designpatterns.behavioral.observer;

/**
 * Created by lav on 4/13/2017.
 */
public class ObserverPattenDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
