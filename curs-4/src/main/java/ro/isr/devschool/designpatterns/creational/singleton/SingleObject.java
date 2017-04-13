package ro.isr.devschool.designpatterns.creational.singleton;

public class SingleObject {
    // the only instance of this object
    private static SingleObject instance = new SingleObject();
    // constructor must be private, so that no object can ne created from outside the class
    private SingleObject(){};
    // get the only instance available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
