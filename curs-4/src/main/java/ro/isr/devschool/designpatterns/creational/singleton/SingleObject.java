package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Mucefix on 06/04/17.
 */
public class SingleObject {
    //the only instance of this object
    private static SingleObject instance = new SingleObject();
    //constructor must be private, so that no object can be created from outside the class
    private SingleObject(){}
    //get the only instance available
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
