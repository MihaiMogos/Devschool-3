package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Andrei on 13.04.2017.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();

        System.out.println("drawing normal circle");
        circle.draw();

        circle=new RedShapeDecorator(new Circle());
        System.out.println("drawing red circle");
        circle.draw();
    }
}
