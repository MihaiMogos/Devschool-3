package ro.isr.devschool.designpatterns.behavioral.strategy;

import ro.isr.devschool.designpatterns.behavioral.strategy.operations.OperationAdd;
import ro.isr.devschool.designpatterns.behavioral.strategy.operations.OperationMultiply;
import ro.isr.devschool.designpatterns.behavioral.strategy.operations.OperationSubstract;
import ro.isr.devschool.designpatterns.behavioral.strategy.operations.Strategy;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy operationAdd = new OperationAdd();
        Strategy operationSubstract = new OperationSubstract();
        Strategy operationMultiply = new OperationMultiply();

        Context context = new Context(operationAdd);
        System.out.println(context.executeStrategy(1, 2));

        context.setStrategy(operationSubstract);
        System.out.println(context.executeStrategy(1, 2));

        context.setStrategy(operationMultiply);
        System.out.println(context.executeStrategy(1, 2));
    }
}
