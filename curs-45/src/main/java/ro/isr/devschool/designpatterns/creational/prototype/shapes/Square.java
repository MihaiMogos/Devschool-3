package ro.isr.devschool.designpatterns.creational.prototype.shapes;

import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Square extends Shape {
    public Square() {
        type = ShapeType.SQUARE;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
