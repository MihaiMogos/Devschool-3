package ro.isr.devschool.designpatterns.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject objectOne = SingleObject.getInstance();
        objectOne.showMessage();
        SingleObject objectTwo = SingleObject.getInstance();
        objectTwo.showMessage();
    }
}
