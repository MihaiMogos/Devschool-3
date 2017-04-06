package ro.isr.devschool.designpatterns.behavioural.command;

import lombok.AllArgsConstructor;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
@AllArgsConstructor
public class SellStock implements Order {

    private Stock abcStock;

    @Override
    public void execute() {
        abcStock.sell();
    }
}
