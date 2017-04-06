package ro.isr.devschool.designpatterns.creational.prototype;

import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;
import ro.isr.devschool.designpatterns.creational.prototype.shapes.Shape;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape(ShapeType.CIRCLE);
        Shape rectangle = ShapeCache.getShape(ShapeType.RECTANGLE);
        Shape square = ShapeCache.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
