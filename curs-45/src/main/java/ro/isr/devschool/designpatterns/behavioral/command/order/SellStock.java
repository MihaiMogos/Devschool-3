package ro.isr.devschool.designpatterns.behavioral.command.order;

import lombok.AllArgsConstructor;
import ro.isr.devschool.designpatterns.behavioral.command.Stock;

/**
 * Created by scipianus on 06-Apr-17.
 */
@AllArgsConstructor
public class SellStock implements Order {
    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
