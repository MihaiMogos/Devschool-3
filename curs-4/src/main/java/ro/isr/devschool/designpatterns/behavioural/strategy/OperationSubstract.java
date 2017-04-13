package ro.isr.devschool.designpatterns.behavioural.strategy;

/**
 * Created by Mucefix on 13/04/17.
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
