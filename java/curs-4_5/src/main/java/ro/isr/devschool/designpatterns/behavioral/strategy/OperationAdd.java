package ro.isr.devschool.designpatterns.behavioral.strategy;

/**
 * Created by Andrei on 13.04.2017.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
