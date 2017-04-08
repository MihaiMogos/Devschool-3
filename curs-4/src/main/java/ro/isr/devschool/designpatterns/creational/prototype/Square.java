package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Mucefix on 06/04/17.
 */
public class Square extends Shape {

    public Square() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
    }

}
