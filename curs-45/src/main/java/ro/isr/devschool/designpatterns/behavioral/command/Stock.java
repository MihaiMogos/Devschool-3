package ro.isr.devschool.designpatterns.behavioral.command;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock name: " + name + " Quantity: " + quantity + " bought");
    }

    public void sell() {
        System.out.println("Stock name: " + name + " Quantity: " + quantity + " sold");
    }
}
