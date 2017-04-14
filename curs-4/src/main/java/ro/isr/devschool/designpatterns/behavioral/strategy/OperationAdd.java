package ro.isr.devschool.designpatterns.behavioral.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }
}
