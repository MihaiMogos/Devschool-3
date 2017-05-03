package ro.isr.devschool.designpatterns.behavioral.command;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 06.04.2017.
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
