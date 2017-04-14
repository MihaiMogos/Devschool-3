package ro.isr.devschool.designpatterns.structural.decorator.shapes;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
