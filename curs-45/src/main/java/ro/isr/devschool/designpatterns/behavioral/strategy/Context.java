package ro.isr.devschool.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;
import ro.isr.devschool.designpatterns.behavioral.strategy.operations.Strategy;

/**
 * Created by scipianus on 13-Apr-17.
 */
@AllArgsConstructor
@Setter
public class Context {
    private Strategy strategy;

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
