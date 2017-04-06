package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        SingleObject singleObject1 = SingleObject.getInstance();
        Thread.sleep(1000);
        SingleObject singleObject2 = SingleObject.getInstance();

        singleObject1.showMessage();
        singleObject2.showMessage();

        if (singleObject1 == singleObject2) {
            System.out.println("Same instance");
        } else {
            System.out.println("Not the same instance");
        }
    }
}
