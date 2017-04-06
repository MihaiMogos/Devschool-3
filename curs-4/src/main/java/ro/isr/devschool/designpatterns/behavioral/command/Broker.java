package ro.isr.devschool.designpatterns.behavioral.command;

import ro.isr.devschool.designpatterns.behavioral.command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }

}
