package ro.isr.devschool.designpatterns.behavioral.command;

/**
 * Created by Andrei on 06.04.2017.
 */
public class Stock {

    private String name="ABC";
    private int quantity=10;


    public void buy(){
        System.out.println("Stock name: "+ name+"quantity: "+quantity+"bought");
    }
    public void sell(){
        System.out.println("Stock name: "+ name+"quantity: "+quantity+"sold");
    }
}
