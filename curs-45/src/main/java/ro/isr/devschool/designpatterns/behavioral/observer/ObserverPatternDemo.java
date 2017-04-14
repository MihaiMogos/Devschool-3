package ro.isr.devschool.designpatterns.behavioral.observer;

import ro.isr.devschool.designpatterns.behavioral.observer.observers.BinaryObserver;
import ro.isr.devschool.designpatterns.behavioral.observer.observers.HexaObserver;
import ro.isr.devschool.designpatterns.behavioral.observer.observers.OctalObserver;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("First state change: 404");
        subject.setState(404);

        System.out.println("Second state change: 500");
        subject.setState(500);
    }
}
