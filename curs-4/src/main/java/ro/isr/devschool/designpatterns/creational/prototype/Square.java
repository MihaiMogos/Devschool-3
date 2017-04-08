package ro.isr.devschool.designpatterns.creational.prototype;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}
