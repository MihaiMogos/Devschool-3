package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Andrei on 06.04.2017.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("drawing a Circle");
    }
}
