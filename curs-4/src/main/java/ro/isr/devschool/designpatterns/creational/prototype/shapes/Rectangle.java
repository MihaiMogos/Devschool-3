package ro.isr.devschool.designpatterns.creational.prototype.shapes;

import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = ShapeType.RECTANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
