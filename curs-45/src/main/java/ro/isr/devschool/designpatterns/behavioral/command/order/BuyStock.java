package ro.isr.devschool.designpatterns.behavioral.command.order;

import lombok.AllArgsConstructor;
import ro.isr.devschool.designpatterns.behavioral.command.Stock;
import ro.isr.devschool.designpatterns.behavioral.command.order.Order;

/**
 * Created by scipianus on 06-Apr-17.
 */
@AllArgsConstructor
public class BuyStock implements Order {
    private Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }
}
