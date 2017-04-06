package ro.isr.devschool.designpatterns.creational.factory.shapes;

import ro.isr.devschool.designpatterns.creational.factory.shapes.Shape;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
