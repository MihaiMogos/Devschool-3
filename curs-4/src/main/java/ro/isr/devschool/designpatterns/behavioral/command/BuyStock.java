package ro.isr.devschool.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuyStock implements Order {
    private Stock abcStock;

    @Override
    public void execute() {
        abcStock.buy();
    }
}