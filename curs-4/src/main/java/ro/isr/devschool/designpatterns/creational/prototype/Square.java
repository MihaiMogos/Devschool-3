package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}