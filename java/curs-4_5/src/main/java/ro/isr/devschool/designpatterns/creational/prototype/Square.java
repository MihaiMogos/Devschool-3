package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Andrei on 06.04.2017.
 */
public class Square extends Shape {
    public Square(){
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("drawing a Square");
    }
}