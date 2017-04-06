package ro.isr.devschool.designpatterns.creational.factory;

import ro.isr.devschool.designpatterns.creational.factory.shapes.*;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
