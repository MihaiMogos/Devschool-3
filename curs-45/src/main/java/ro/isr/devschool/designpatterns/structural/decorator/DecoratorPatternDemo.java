package ro.isr.devschool.designpatterns.structural.decorator;

import ro.isr.devschool.designpatterns.structural.decorator.decorators.RedShapeDecorator;
import ro.isr.devschool.designpatterns.structural.decorator.shapes.Circle;
import ro.isr.devschool.designpatterns.structural.decorator.shapes.Rectangle;
import ro.isr.devschool.designpatterns.structural.decorator.shapes.Shape;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println();

        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        System.out.println();

        Shape rectangle = new Rectangle();
        rectangle.draw();
        System.out.println();

        Shape redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
        System.out.println();
    }
}
