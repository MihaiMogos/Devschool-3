package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private long timeStamp;

    private SingleObject() {
        timeStamp = System.currentTimeMillis();
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, world!");
        System.out.println("Creation time: " + timeStamp);
    }
}
