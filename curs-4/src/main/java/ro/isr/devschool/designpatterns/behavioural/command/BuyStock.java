package ro.isr.devschool.designpatterns.behavioural.command;

import lombok.AllArgsConstructor;

/**
 * Created by crist on 06-Apr-17.
 */
@AllArgsConstructor
public class BuyStock implements Order {
    private Stock abcStock;
    @Override
    public void execute() {
        abcStock.buy();
    }
}