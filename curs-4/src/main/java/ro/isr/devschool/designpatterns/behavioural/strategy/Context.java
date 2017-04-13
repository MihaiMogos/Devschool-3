package ro.isr.devschool.designpatterns.behavioural.strategy;

import lombok.Setter;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Context {
    @Setter
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
