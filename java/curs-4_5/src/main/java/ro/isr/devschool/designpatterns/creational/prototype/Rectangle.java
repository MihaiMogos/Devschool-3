package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Andrei on 06.04.2017.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="rectangle";
    }

    @Override
    void draw() {
        System.out.println("drawing a rectangle");
    }
}
