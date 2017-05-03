package ro.isr.devschool.designpatterns.behavioral.strategy;

/**
 * Created by Andrei on 13.04.2017.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());

        System.out.println("Add "+context.executeStrategy(1,2));
        context.setStrategy(new OperationSubstract());

        System.out.println("Multiply "+ context.executeStrategy(1,2));
        context.setStrategy(new OperationSubstract());

        System.out.println("Substract "+context.executeStrategy(1,2));
        context.setStrategy(new OperationSubstract());

    }
}
