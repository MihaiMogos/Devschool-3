package ro.isr.devschool.designpatterns.behavioural.command;

import lombok.AllArgsConstructor;

/**
 * Created by Mucefix on 06/04/17.
 */
@AllArgsConstructor
public class BuyStock implements Order {
    private Stock abcStock;
    @Override
    public void execute() {
        abcStock.buy();
    }
}
