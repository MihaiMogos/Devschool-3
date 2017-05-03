package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Andrei on 06.04.2017.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject objectOne=SingleObject.getInstance();
        objectOne.showMessage();
        SingleObject objectTwo=SingleObject.getInstance();
        objectTwo.showMessage();
    }
}
