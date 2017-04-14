package ro.isr.devschool.designpatterns.creational.prototype.shapes;

import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Circle extends Shape {
    public Circle() {
        type = ShapeType.CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
