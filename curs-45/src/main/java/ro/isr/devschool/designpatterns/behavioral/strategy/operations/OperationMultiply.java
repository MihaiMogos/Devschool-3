package ro.isr.devschool.designpatterns.behavioral.strategy.operations;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
