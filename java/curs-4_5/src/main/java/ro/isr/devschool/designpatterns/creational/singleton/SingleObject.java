package ro.isr.devschool.designpatterns.creational.singleton;

/**
 * Created by Andrei on 06.04.2017.
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();

    private SingleObject(){
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world");
    }
}
