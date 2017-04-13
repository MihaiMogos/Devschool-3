package ro.isr.devschool.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crist on 06-Apr-17.
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
