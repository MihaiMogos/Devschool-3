package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by crist on 06-Apr-17.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
