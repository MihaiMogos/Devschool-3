package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
