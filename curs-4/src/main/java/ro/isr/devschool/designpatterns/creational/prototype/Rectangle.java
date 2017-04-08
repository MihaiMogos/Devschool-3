package ro.isr.devschool.designpatterns.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
