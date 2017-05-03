package ro.isr.devschool.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * Created by Andrei on 06.04.2017.
 */
@AllArgsConstructor
public class SellStock implements Order {

    private Stock abcStock;
    @Override
    public void execute() {
        abcStock.sell();
    }
}
