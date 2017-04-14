package ro.isr.devschool.designpatterns.behavioral.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        System.out.print("Add: ");
        Context context = new Context(new OperationAdd());
        context.executeStrategy(1, 2);

        System.out.print("Substract: ");
        context = new Context(new OperationSubstract());
        context.executeStrategy(1, 2);

        System.out.print("Multiply: ");
        context = new Context(new OperationMultiply());
        context.executeStrategy(1, 2);
    }
}
