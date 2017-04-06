package ro.isr.devschool.designpatterns.creational.factory;

import ro.isr.devschool.designpatterns.creational.factory.shapes.Shape;
import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
