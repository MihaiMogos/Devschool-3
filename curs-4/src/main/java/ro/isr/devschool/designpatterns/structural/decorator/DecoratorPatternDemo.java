package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 13/04/17.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        System.out.println("Drawing normal circle");
        circle.draw();

        circle = new RedShapeDecorator(new Circle());
        System.out.println("Drawing red cicle");
        circle.draw();
    }

}
