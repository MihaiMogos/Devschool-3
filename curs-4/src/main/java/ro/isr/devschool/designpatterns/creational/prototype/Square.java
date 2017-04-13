package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by crist on 06-Apr-17.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
