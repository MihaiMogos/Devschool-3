package ro.isr.devschool.designpatterns.creational.prototype;

import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;
import ro.isr.devschool.designpatterns.creational.prototype.shapes.Circle;
import ro.isr.devschool.designpatterns.creational.prototype.shapes.Rectangle;
import ro.isr.devschool.designpatterns.creational.prototype.shapes.Shape;
import ro.isr.devschool.designpatterns.creational.prototype.shapes.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class ShapeCache {
    private static Map<ShapeType, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(ShapeType shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(ShapeType.CIRCLE, circle);

        Square square = new Square();
        square.setId("1");
        shapeMap.put(ShapeType.SQUARE, square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(ShapeType.RECTANGLE, rectangle);
    }
}
