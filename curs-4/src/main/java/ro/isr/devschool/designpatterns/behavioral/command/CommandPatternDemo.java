package ro.isr.devschool.designpatterns.behavioral.command;

import ro.isr.devschool.designpatterns.behavioral.command.order.BuyStock;
import ro.isr.devschool.designpatterns.behavioral.command.order.Order;
import ro.isr.devschool.designpatterns.behavioral.command.order.SellStock;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Order buyStockOrder = new BuyStock(stock);
        Order sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
