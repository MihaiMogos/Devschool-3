package ro.isr.devschool.designpatterns.behavioral.strategy;

import lombok.Setter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class Context {
    @Setter
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
