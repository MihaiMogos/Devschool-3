package ro.isr.devschool.designpatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        SingleObject objectOne = SingleObject.getInstance();
        SingleObject objectTwo = SingleObject.getInstance();

        if(objectOne == objectTwo) {
            System.out.println("Works!");
        } else {
            System.out.println("Bad!");
        }
    }
}
