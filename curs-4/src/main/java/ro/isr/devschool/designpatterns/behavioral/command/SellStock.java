package ro.isr.devschool.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellStock implements Order{
    private Stock abcStock;

    @Override
    public void execute() {
        abcStock.sell();
    }
}