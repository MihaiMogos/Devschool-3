package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
